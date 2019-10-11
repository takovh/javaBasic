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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
