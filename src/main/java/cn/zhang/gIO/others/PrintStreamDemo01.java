package cn.zhang.gIO.others;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream 打印流（处理流）
 * @author tako_
 *
 */
public class PrintStreamDemo01 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("test");
		PrintStream ps = System.out;
		ps.println(false);
		
		//输出到文件
		File src = new File("D:/tmp/d.txt");
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
		ps.println("abc123");
		ps.close();
	}
}
