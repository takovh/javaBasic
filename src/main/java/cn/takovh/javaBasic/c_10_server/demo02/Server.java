package cn.takovh.javaBasic.c_10_server.demo02;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * 创建服务器并启动
 * 使用Response+Request+servlet
 * @author tako_
 *
 */
public class Server {
	private ServerSocket server;
	public static String BLANK = " ";
	public static String CRLF = "\r\n";
	private boolean isShutDown = false;
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	/**
	 * 启动方法
	 */
	public void start(int port) {		
		try {
			server= new ServerSocket(port);		
			this.recieve();
		} catch (IOException e) {
			e.printStackTrace();
			stop();
		}	
	}
	public void start() {		
		start(8888);	
	}
	/**
	 * 接收客户端
	 */
	private void recieve() {
		try {
			while(!isShutDown) {
				new Thread(new Dispatcher(server.accept())).start();
			}		
		} catch (IOException e) {
			e.printStackTrace();
			stop();
		}
	}
	/**
	 * 停止服务器
	 */
	public void stop() {
		isShutDown = true;
		CloseUtil.closeSocket(server);
	}
}
