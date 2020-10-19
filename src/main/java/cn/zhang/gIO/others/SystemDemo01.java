package cn.zhang.gIO.others;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 三个常量
 * 1.System.in
 * 2.System.out
 * 3.System.err
 * @author tako_
 *
 */
public class SystemDemo01 {
	public static void main(String[] args) throws FileNotFoundException {
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		System.out.println("test");
		System.err.println("err");
	}
	public static void test2() {
		InputStream is = System.in;//键盘输入
		Scanner sc = new Scanner(is);
		System.out.println("Please input:");
		System.out.println(sc.nextLine());
		sc.close();
	}
	public static void test3() throws FileNotFoundException {
		//重定向 SetIn() SetOut() SetErr()
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("D:/tmp/a.txt")), true));
		System.out.println("HelloWorld world!");//控制台 --> 文件
		//回控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)), true));
		System.out.println("back...");//控制台
	}
	
}
