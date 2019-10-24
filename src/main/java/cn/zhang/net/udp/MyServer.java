package cn.zhang.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 服务端
 * 1.创建服务端 + 端口
 * 2.准备接收容器
 * 3.封装成包
 * 4.接收数据
 * 5.分析数据
 * @author tako_
 *
 */
public class MyServer {
	public static void main(String[] args) throws IOException {
		//1.创建服务端 + 端口
		DatagramSocket server = new DatagramSocket(8888);
		//2.准备接收容器
		byte[] container = new byte[1024];
		//3.封装成包DatagramPacket(buf, length)
		DatagramPacket packet = new DatagramPacket(container, container.length);
		//4.接收数据
		server.receive(packet);
		//5.分析数据
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(data,0,len));
		server.close();
	}
}
