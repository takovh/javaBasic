package cn.zhang.net.tcp.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端（群聊 + 私聊）
 * 加入用户ID
 * 1.创建客户端：发送数据+接收数据，必须指定服务器 + 端口，此时就在连接
 * 写出数据：输出流
 * 读取数据：输入流
 * 2.发送数据 + 接收数据
 * bug:后面的人要等前面的人输入自己的昵称之后才能登陆
 * @author tako_
 *
 */
public class Demo04Client {
	private static String name = "";
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 9999);
		setName();
		new Thread(new Demo04Send(client, name)).start();//一条路径
		new Thread(new Demo04Recieve(client)).start();//一条路径
	}
	
	private static void setName() throws IOException {
		System.out.print("请输入你的昵称：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		while(name.equals("")) {
			System.out.print("昵称无效，请重新输入:");
			br = new BufferedReader(new InputStreamReader(System.in));
			name = br.readLine();
		}
	}
}
