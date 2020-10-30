package cn.takovh.javaBasic.c_09_net.tcp.chat;

import java.io.DataInputStream;
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
public class Demo02Server {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//1.创建服务端 + 端口
		ServerSocket server = new ServerSocket(9999);
		//2.接收客户端的连接 阻塞式
		Socket client = server.accept();//The method blocks until a connection is made. 
					
		DataInputStream dis = new DataInputStream(client.getInputStream());//输入流
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());//输出流
		
		//3.接收数据 + 发送数据
		while(true) {
			String message = dis.readUTF();//接收数据
			System.out.println(message);		
			dos.writeUTF("服务器-->" + message);//发送数据
			dos.flush();
		}
	}
}
