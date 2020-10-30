package cn.takovh.javaBasic.c_10_server.demo01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建服务器并启动
 * 使用Response
 * @author tako_
 *
 */
public class Server4 {
	private ServerSocket server;
	public static String BLANK = " ";
	public static String CRLF = "\r\n";
	public static void main(String[] args) {
		Server4 server = new Server4();
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
			Response rep = new Response(client.getOutputStream());
			rep.println("<html><head><title>HTTP响应示例</title></head><body>李险贵和尹杰是好基友！</body></html>");
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
