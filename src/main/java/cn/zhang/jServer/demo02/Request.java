package cn.zhang.jServer.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 封装request
 * 处理请求
 * @author tako_
 *
 */
public class Request {
	private String method;//请求方式
	private String url;//请求资源
	private Map<String,List<String>> parameterMapValues;//请求参数
	//内部
	public static String CRLF = "\r\n";
	@SuppressWarnings("unused")
	private InputStream is;
	private String requestInfo;
	
	public Request() {
		method = "";
		url = "";
		parameterMapValues = new HashMap<String,List<String>>();
		requestInfo = "";
	}
	public Request(InputStream is) {
		this();
		this.is = is;
		try {
			byte[] data = new byte[20480];
			int len = is.read(data);
			requestInfo = new String(data,0,len);
		} catch (IOException e) {
			return ;
		}
		//分析头信息
		parseRequestInfo();
	}
	//分析头信息
	private void parseRequestInfo() {
		requestInfo = requestInfo.trim();
		if(null==requestInfo||requestInfo.equals("")) return ;
		/**
		 * =========================================
		 * 从信息的首行分解出：请求方式，请求路径，请求参数（get可能存在）
		 * GET /index.html?uname=zhangyu&pwd=123 HTTP/1.1
		 * POST /index.html HTTP/1.1
		 * 如果为pst方式， 请求参数在最后正文中
		 * ========================================= 
		 */
		String paramString = "";//接收请求参数
		//1.获取请求参数
		String firstLine = requestInfo.substring(0, requestInfo.indexOf(CRLF));
		int idx = requestInfo.indexOf("/");// /的位置
		this.method = firstLine.substring(0, idx).trim();
		String urlStr = firstLine.substring(idx, firstLine.indexOf("HTTP/")).trim();
		if(this.method.equalsIgnoreCase("post")) {
			this.url = urlStr;
			paramString = requestInfo.substring(requestInfo.lastIndexOf(CRLF)).trim();
		}else if(this.method.equalsIgnoreCase("get")) {
			if(urlStr.contains("?")) {//是否存在参数
				String[] urlArray = urlStr.split("\\?");
				this.url = urlArray[0];
				paramString = urlArray[1];//接收请求参数
			}else {
				this.url = urlStr;
			}
		}
		//2.将请求参数封装到Map中
		if(paramString.equals("")) return ;
		parseParams(paramString);
	}
	private void parseParams(String paramString) {
		//分割
		StringTokenizer token = new StringTokenizer(paramString, "&");
		while(token.hasMoreTokens()) {
			String[] keyValues = token.nextToken().split("=");
			String key = keyValues[0].trim();
			String value = decode(keyValues[1].trim(),"GBK");
			if(!parameterMapValues.containsKey(key)) parameterMapValues.put(key, new ArrayList<String>());
			List<String> values = parameterMapValues.get(key);
			values.add(value);
		}
	}
	/**
	 * 解决中文问题
	 * @param value
	 * @param code
	 * @return
	 */
	private String decode(String value, String code) {
		try {
			return java.net.URLDecoder.decode(value, code);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 根据页面的name获取对应的多个值
	 */
	public String[] getParameterValues(String name) {
		List<String> values = null;
		if((values=parameterMapValues.get(name))==null) return null;
		else return values.toArray(new String[0]);
	}
	/**
	 * 根据页面的name获取对应的值
	 */
	public String getParameter(String name) {
		String[] values = getParameterValues(name);
		if(null==values) return null;
		return 	values[0];
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
