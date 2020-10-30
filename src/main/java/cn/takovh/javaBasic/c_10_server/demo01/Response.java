package cn.takovh.javaBasic.c_10_server.demo01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

/**
 * 封装相应信息
 * @author tako_
 *
 */
public class Response {
	public static String BLANK = " ";
	public static String CRLF = "\r\n";
	private BufferedWriter bw;//流
	private StringBuilder headInfo;//存储头信息
	private StringBuilder content;//正文
	private int len;//正文长度
	
	public Response(){
		headInfo = new StringBuilder();
		content = new StringBuilder();
		len = 0;
	}
	public Response(OutputStream os){
		this();
		bw = new BufferedWriter(new OutputStreamWriter(os));
	}
	public Response(Socket client){
		this();
		try {
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			headInfo = null;
		}
	}
	/**
	 * 构建响应头
	 */
	private void creatHeadInfo(int code) {
		//1.HTTP协议版本、状态代码、描述
		headInfo.append("HTTP/1.1").append(BLANK).append(code).append(BLANK);
		switch(code) {
			case 200: headInfo.append("OK"); break;
			case 404: headInfo.append("NOT FOUND"); break;
			case 505: headInfo.append("SERVER ERROR"); break;
		}
		headInfo.append(CRLF);
		//2.响应头（Respons Head）
		headInfo.append("Server:tencent Server/0.0.1").append(CRLF);
		headInfo.append(new Date()).append(CRLF);//"Data:Mon,7Jan2019 13:18:00 GMT"
		headInfo.append("Content-type:text/html;charset=GBK").append(CRLF);
		headInfo.append("Content-length:").append(len).append(CRLF);//正文长度：字节长度
		//3.正文之前
		headInfo.append(CRLF);
	}
	/**
	 * 构建正文
	 */
	public Response print(String info) {
		content.append(info);
		len+=info.getBytes().length;
		return this;
	}
	public Response println(String info) {
		content.append(info).append(CRLF);
		len+=(info+CRLF).getBytes().length;
		return this;
	}
	/**
	 * 推送到客户端
	 * @throws IOException 
	 */
	void pushToClient(int code) throws IOException {
		if(null==headInfo) code = 500;
		creatHeadInfo(code);
		//头信息+分隔符
		bw.append(headInfo.toString());
		//正文
		bw.append(content.toString());
		bw.flush();
	}
	public void close() {
		CloseUtil.closeIO(bw);
	}
}
