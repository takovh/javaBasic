package cn.zhang.gIO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据+类型 输出到文件
 * 数据类型（基本+String）处理流
 * 1.输入流DataInputStream ReadXxx()
 * 2.输出流DataOutputStream WriteXxx()
 * 新增方法不能使用多态
 * 
 * java.gIO.EOFException :没有读取到相关的内容
 * @author tako_
 *
 */
public class DataDemo01 {
	public static void main(String[] args) throws IOException {
		//write("D:/tmp/d.txt");
		read("D:/tmp/d.txt");
	}
	/**
	 * 数据+类型 输出到文件
	 * @throws IOException 
	 */
	public static void write(String destPath) throws IOException {
		double point = 2.5;
		long num = 100L;
		String str = "数据类型";
		//创建源
		File dest = new File(destPath);
		///DataOutputStream
		DataOutputStream dos = new DataOutputStream(
					new BufferedOutputStream(
								new FileOutputStream(dest)
							)
				);
		//操作
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}
	
	/**
	 * 从文件中读取数据+类型
	 * @throws IOException 
	 */
	public static void read(String destPath) throws IOException {
		//创建源
		File src = new File(destPath);
		//选择流
		DataInputStream dis = new DataInputStream(
					new BufferedInputStream(
								new FileInputStream(src)
							)
				);
		//操作：读取的顺序必须与写出一致 必须存在才能读取
		double num1 = dis.readDouble();
		long num2 = dis.readLong();
		String str = dis.readUTF();
		System.out.println(num1 + num2 + str);
		dis.close();
	}
}
