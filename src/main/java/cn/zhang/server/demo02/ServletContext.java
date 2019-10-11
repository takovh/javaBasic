package cn.zhang.server.demo02;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 * @author tako_
 *
 */
public class ServletContext {
	private Map<String, String> servlet;
	private Map<String, String> mapping;
	public ServletContext() {
		//为每个servlet取一个别名
		//login --> LoginServlet
		servlet = new HashMap<String, String>();
		//url-->login
		//  /log --> login
		//  /login --> login
		mapping = new HashMap<String, String>();
	}
	public Map<String, String> getServlet() {
		return servlet;
	}
	public void setServlet(Map<String, String> servlet) {
		this.servlet = servlet;
	}
	public Map<String, String> getMapping() {
		return mapping;
	}
	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}
	
	
}
