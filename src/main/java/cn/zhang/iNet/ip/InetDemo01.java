package cn.zhang.iNet.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 封装ip及DNS
 * 1.getHostAddress()
 * 2.getHostName()
 * @author tako_
 *
 */
public class InetDemo01 {
	public static void main(String[] args) throws UnknownHostException {
		//使用getLocalHost方法创建InetAddress对象
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//返回192.168.227.1
		System.out.println(addr.getHostName());//输出计算机名：DESKTOP-59NVJL1
		
		//根据域名得到InetAddress对象
		addr = InetAddress.getByName("www.163.com");
		System.out.println(addr.getHostAddress());//返回163服务器的ip:113.142.80.177
		System.out.println(addr.getHostName());//输出域名
		
		//根据ip得到InetAddress对象
		addr = InetAddress.getByName("113.142.80.177");
		System.out.println(addr.getHostAddress());//返回163服务器的ip:113.142.80.177
		System.out.println(addr.getHostName());//输出ip
	}
}
