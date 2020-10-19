package cn.zhang.jServer.demo01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建服务器并启动
 * 使用Response+Request+servlet
 * @author tako_
 *
 */
public class Server6 {
	private ServerSocket server;
	public static String BLANK = " ";
	public static String CRLF = "\r\n";
	public static void main(String[] args) {
		Server6 server = new Server6();
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
			Servlet serv = new Servlet();
			Request req = new Request(client.getInputStream());
			Response rep = new Response(client.getOutputStream());
			serv.service(req, rep);
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
