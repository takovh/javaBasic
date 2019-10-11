package cn.zhang.net.tcp.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端（接收多个客户端）
 * 1.创建服务端 + 端口
 * 2.接收客户端的连接 阻塞式
 * 3.发送数据 + 接收数据
 * @author tako_
 *
 */
public class MultiServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//1.创建服务端 + 端口
		ServerSocket server = new ServerSocket(8888);//服务不关闭，不需要server.close()		
		while(true) {
			//2.接收客户端的连接 阻塞式 握手
			//accept()
			//The method blocks until a connection is made. 
			Socket socket = server.accept();
			System.out.println("一个客户端建立连接");//浏览器访问http:localhost:8888
			//3.发送数据 + 接收数据
			String message = "欢迎使用";
			//输出流			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(message);
			dos.flush();
		}		
	}
}
