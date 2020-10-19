package cn.zhang.dUsefulClass.file;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		File f1 = new File("E:/HelloWorld.java");
		File f2 = new File("E:/");
		File f3 = new File(f2,"HelloWorld.java");
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
	}
}
