package cn.zhang.net.ip;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * 封装了端口
 * 在InetAddress的基础上+端口
 * 1.getPort()
 * 2.getHostName()
 * 3.getAddress()
 * @author tako_
 *
 */
public class InetSocketDemo01 {
	public static void main(String[] args) {
		//
		InetSocketAddress addr = new InetSocketAddress("localhost", 9999);
		System.out.println("getHostName:" + addr.getHostName());
		System.out.println("getHostName:" + addr.getAddress().getHostName());
		System.out.println("getPort:" + addr.getPort());
		
		InetAddress add = addr.getAddress();
		System.out.println("getHostAddress:" + add.getHostAddress());//返回192.168.227.1
		System.out.println("getHostName:" + add.getHostName());//输出计算机名：DESKTOP-59NVJL1
	}
}
