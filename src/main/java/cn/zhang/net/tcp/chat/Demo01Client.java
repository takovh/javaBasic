package cn.zhang.net.tcp.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 * 1.创建客户端：发送数据+接收数据，必须指定服务器 + 端口，此时就在连接
 * 写出数据：输出流
 * 读取数据：输入流
 * 2.准备数据	double-->字节数组
 * 3.接收数据 + 发送数据
 * @author tako_
 *
 */
public class Demo01Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.创建客户端，指定服务器 + 端口，此时就在连接
		Socket socket = new Socket("localhost", 9999);//与server建立连接
		
		//控制台输入流
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));//client输入聊天内容
		String info = console.readLine();//info <-- 输入聊天内容
		//输出流
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(info);
		dos.flush();
		//输入流
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String message = dis.readUTF();
		System.out.println(message);
	}
}
