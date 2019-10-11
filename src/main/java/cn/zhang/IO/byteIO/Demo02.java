package cn.zhang.IO.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 写出文件
 * 1.建立联系 File对象 目的地
 * 2.选择流 文件输出流OutputStream FileOutputStream
 * 3.操作： write(byte[] b, int off, int len)+flush
 * 4.释放资源：关闭
 * @author tako_
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//1.建立联系 File对象 目的地
		File dest = new File("D:/tmp/b.txt");
		//2.选择流
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(dest, true);//true表示以追加形式写出文件，false表示覆盖
			//3.操作
			String str = "Hello Moto!\r\n";
			//字符串转字节(byte)数组
			byte[] data = str.getBytes();
			
			/**
			 * public void write​(byte[] b, int off, int len)
			 * Writes len bytes from the specified byte array starting at offset off to this output stream.
			 */
			os.write(data, 0, data.length);
			os.flush();//强制刷新出去
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件未找到！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件写出失败！");
		}finally {
			//4.释放资源：关闭
			try {
				if (null != os)
					os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭输出流失败！");
			}
		}
		
	}
}
