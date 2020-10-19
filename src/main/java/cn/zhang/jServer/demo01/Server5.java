package cn.zhang.jServer.demo01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建服务器并启动
 * 使用Response+Request
 * @author tako_
 *
 */
public class Server5 {
	private ServerSocket server;
	public static String BLANK = " ";
	public static String CRLF = "\r\n";
	public static void main(String[] args) {
		Server5 server = new Server5();
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
	private void recieve() {
		try {
			Socket client = server.accept();			
			//请求
			Request req = new Request(client.getInputStream());
			
			//响应
			Response rep = new Response(client.getOutputStream());
			rep.println("<html><head><title>HTTP响应示例</title></head><body>");
			rep.println("欢迎：").println(req.getParameter("uname")).println("回来了！");
			rep.println("</body></html>");
			rep.pushToClient(200);
			
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
