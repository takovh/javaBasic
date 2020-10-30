package cn.takovh.javaBasic.c_10_server.demo01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 创建服务器并启动
 * 请求+响应
 * @author tako_
 *
 */
public class Server3 {
	private ServerSocket server;
	public static String BLANK = " ";
	public static String CRLF = "\r\n";
	public static void main(String[] args) {
		Server3 server = new Server3();
		server.start();
	}
	/**
	 * 启动方法
	 */
	public void start() {		
		try {
			server= new ServerSocket(8888);		
			this.recieve();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 接收客户端
	 */
	@SuppressWarnings("unused")
	private void recieve() {
		try {
			Socket client = server.accept();			
			String msg = null;//接收客户端的请求信息
			
			byte[] data = new byte[20480];
			int len = client.getInputStream().read(data);
			
			//接收客户端的请求信息
			String requestInfo = new String(data,0,len).trim();
			System.out.println(requestInfo);
			
			//响应
			StringBuilder responseContext = new StringBuilder();
			responseContext.append("<html><head><title>HTTP响应示例</title></head><body>HelloWorld Tomcat!</body></html>");
			StringBuilder response = new StringBuilder();
			//1.HTTP协议版本、状态代码、描述
			response.append("HTTP/1.1").append(BLANK).append("200").append(BLANK).append("OK").append(CRLF);
			//2.响应头（Respons Head）
			response.append("Server:tencent Server/0.0.1").append(CRLF);
			response.append(new Date()).append(CRLF);//"Data:Mon,7Jan2019 13:18:00 GMT"
			response.append("Content-type:text/html;charset=GBK").append(CRLF);
			response.append("Content-length:").append(responseContext.toString().getBytes().length).append(CRLF);//正文长度：字节长度
			//3.正文之前
			response.append(CRLF);
			//4.正文
			response.append(responseContext);
			
			//输出流
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			bw.write(response.toString());
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 停止服务器
	 */
	public void stop() {
		
	}
}
