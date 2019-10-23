package cn.zhang.exception.trycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("d:/a.txt");
			char c1 = (char)reader.read();
			char c2 = (char)reader.read();
			System.out.println(""+c1+c2);
		} catch (FileNotFoundException e) {
			System.err.println("系统找不到指定的文件");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
