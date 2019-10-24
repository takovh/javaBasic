package cn.zhang.net.tcp.chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端（群聊）
 * 1.创建客户端：发送数据+接收数据，必须指定服务器 + 端口，此时就在连接
 * 写出数据：输出流
 * 读取数据：输入流
 * 2.发送数据 + 接收数据
 * @author tako_
 *
 */
public class Demo03Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.创建客户端
		Socket client = new Socket("localhost", 9999);
		new Thread(new Demo02Send(client)).start();//一条路径
		new Thread(new Demo02Recieve(client)).start();//一条路径
	}
}
