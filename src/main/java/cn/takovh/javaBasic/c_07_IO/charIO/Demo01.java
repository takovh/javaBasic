package cn.takovh.javaBasic.c_07_IO.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 纯文本读取
 * @author tako_
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//创建源
		File src = new File("D:/tmp/a.txt");
		//选择流
		Reader reader = null;
		try {
			reader = new FileReader(src);
			//读取操作
			char[] flush = new char[1024];
			int len = 0;
			/**
			 * read​(char[] cbuf)
			 * Reads characters into an c_03_array.
			 * Returns the number of characters read, or -1 if the end of the stream has been reached
			 */
			while(-1!=(len=reader.read(flush))) {
				//字符数组转字符串
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("源文件不存在！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读取失败！");
		}finally {
			try {
				if (null != reader)
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
