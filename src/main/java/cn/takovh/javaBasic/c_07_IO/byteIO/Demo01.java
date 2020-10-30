package cn.takovh.javaBasic.c_07_IO.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件的读取
 * 1.建立联系
 * 2.选择流
 * 3.操作： read​(byte[] b)
 * 4.释放资源
 * @author tako_
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//1.建立联系,File对象
		File src = new File("D:/tmp/a.txt");
		//2.选择流
		InputStream is = null;//提升作用域
		try {
			is = new FileInputStream(src);
			//3.操作不断读取 缓冲数组
			byte[] car = new byte[1024];
			int len = 0;//接收 实际读取大小<1024
			//循环读取
			/**
			 * public int read​(byte[] b) 
			 * Reads some number of bytes from the input stream 
			 * and stores them into the buffer c_03_array b.
			 * Return the total number of bytes read into the buffer,
			 * or -1 if there is no more data because the end of the stream has been reached.
			 */
			/**
			 * String​(byte[] bytes, int offset, int length)
			 * Constructs a new String by decoding the specified subarray of bytes 
			 * using the platform's default charset.
			 */
			while(-1!=(len=is.read(car))) {
				//输出 字节数组转成字符串
				String info = new String(car, 0, len);
				//String info = new String(car);//会一直读到1024
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件不存在！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("读取文件失败！");
		}finally {
			//4.释放资源
			try {
				if (null != is)
					is.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭文件输入流失败！");
			}
		}
	}
}
