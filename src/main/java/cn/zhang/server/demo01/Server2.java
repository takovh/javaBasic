package cn.zhang.server.demo01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建服务器并启动
 * post
 * @author tako_
 *
 */
public class Server2 {
	private ServerSocket server;
	public static void main(String[] args) {
		Server2 server = new Server2();
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
