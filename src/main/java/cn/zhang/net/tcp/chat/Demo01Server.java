package cn.zhang.net.tcp.chat;

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
public class Demo01Server {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//1.创建服务端 + 端口
		ServerSocket server = new ServerSocket(9999);//服务不关闭，不需要server.close()
		Socket socket = server.accept();//得到连接过来的一个client的*socket*
		
		//写出数据
		//输入流
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String message = dis.readUTF();
		//输出流
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("服务器-->" + message);
		dos.flush();

	}
}
