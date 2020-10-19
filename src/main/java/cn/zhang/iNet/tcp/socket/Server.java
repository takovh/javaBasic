package cn.zhang.iNet.tcp.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * 1.创建服务端 + 端口
 * 2.接收客户端的连接 阻塞式
 * 3.发送数据 + 接收数据
 * @author tako_
 *
 */
public class Server {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//1.创建服务端 + 端口
		ServerSocket server = new ServerSocket(8888);//服务不关闭，不需要server.close()
		//2.接收客户端的连接 阻塞式 握手
		Socket socket = server.accept();
		System.out.println("一个客户端建立连接");//浏览器访问http:localhost:8888
		//3.发送数据 + 接收数据
		//输出流
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		String message = "欢迎使用";
		dos.writeUTF(message);
		dos.flush();
		/*
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write(message);
		bw.newLine();
		bw.flush();
		*/
	}
}
