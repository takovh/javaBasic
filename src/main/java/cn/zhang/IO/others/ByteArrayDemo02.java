package cn.zhang.IO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1.文件 --程序--> 字节数组
 * 1)文件输入流  字节数组输出流
 * 
 * 2.字节数组 --程序--> 文件
 * 1)字节数组输入流  文件输出流
 * @author tako_
 *
 */
public class ByteArrayDemo02 {
	public static void main(String[] args) throws IOException {
		byte[] data = getByteFromFile("D:/tmp/a.txt");//1.文件1 --程序--> 字节数组
		toFileFromByteArray(data, "D:/tmp/c.txt");//2.字节数组 --程序--> 文件2
	}
	
	/**
	 * 1.文件 --程序--> 字节数组
	 * @return
	 * @throws IOException 
	 */
	public static byte[] getByteFromFile(String srcPath) throws IOException {
		//1.创建文件源
		File src = new File(srcPath);
		//创建字节数组目的地
		byte[] dest = null;
		
		//2.选择流：文件输入流 + 字节数组输出流
		//文件输入流
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		//字节数组输出流不能使用多态
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		//3.操作 不断读取文件 写出到字节数组流中
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1!=(len=is.read(flush))) {
			//写出到字节数组流中
			baos.write(flush, 0, len);
		}
		baos.flush();
		
		//4.获取数据
		dest = baos.toByteArray();
		baos.close();
		is.close();
		return dest;
	}
	
	/**
	 * 2.字节数组 --程序--> 文件
	 * 1)字节数组输入流  文件输出流
	 * @throws IOException 
	 */
	public static void toFileFromByteArray(byte[] src, String destPath) throws IOException {
		//创建源
		//目的地
		File dest = new File(destPath);
		//选择流:字节数组输入流 + 文件输出流
		//字节数组输入流
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		//文件输出流
		OutputStream os = new BufferedOutputStream(new FileOutputStream(dest));
		//操作：不断读取字节数组
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1!=(len=is.read(flush))) {
			//写出到文件中
			os.write(flush, 0, len);
		}
		os.flush();
		
		os.close();
		is.close();
	}
}
