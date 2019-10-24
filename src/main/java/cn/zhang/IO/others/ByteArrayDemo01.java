package cn.zhang.IO.others;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组 节点流
 * 数组的长度有限, 数据量不会很大
 * 
 * 文件内容不要太大
 * 1.文件 --程序--> 字节数组
 * 2.字节数组 --程序--> 文件
 * @author tako_
 *
 */
public class ByteArrayDemo01 {
	public static void main(String[] args) throws IOException {
		read(write());
	}
	
	/**
	 * 输入流 操作与文件输入流一致
	 * 读取字节数组
	 * @throws IOException 
	 */
	public static void read() throws IOException {
		String msg = "操作与文件输入流一致";
		byte[] src = msg.getBytes();
		
		//选择流
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		//操作
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1!=(len=is.read(flush))) System.out.println(new String(flush, 0, len));
		//释放资源
		is.close();
	}
	public static void read(byte[] src) throws IOException {
		//选择流
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		//操作
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1!=(len=is.read(flush))) System.out.println(new String(flush, 0, len));
		//释放资源
		is.close();
	}
	
	/**
	 * 输出流 操作与文件输出流有些不同，有新增方法，不能使用多态
	 * @throws IOException 
	 */
	public static byte[] write() throws IOException {
		//目的地
		byte[] dest;
		//选择流 不同点
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//操作 写出
		String msg = "操作与文件输入流一致";
		byte[] info = msg.getBytes();
		baos.write(info, 0, info.length);
		//获取数据
		dest = baos.toByteArray();
		//释放资源
		baos.close();
		return dest;
	}
}
