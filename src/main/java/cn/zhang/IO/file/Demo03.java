package cn.zhang.IO.file;

import java.io.File;

/**
 * 输出子孙级目录|文件的名称(绝对路径)
 * 1.listFiles
 * 2.递归
 * @author tako_
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		String path = "D:/tmp";
		File parent = new File(path);
		printName(parent);
	}
	
	//输出路径
	public static void printName(File src) {
		if(null==src||!src.exists()) return;
		System.out.println(src.getAbsolutePath());
		if(src.isDirectory()) for(File sub:src.listFiles()) printName(sub);
	}
}
