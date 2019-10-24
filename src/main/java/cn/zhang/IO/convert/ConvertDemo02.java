package cn.zhang.IO.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 转换流：字节转字符
 * 1.输出流 OutputStreamWriter ->编码
 * 2.输入流 InputStreamReader ->解码
 * @author tako_
 * 
 */
public class ConvertDemo02 {
	public static void main(String[] args) throws IOException {
		//指定解码字符集
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(new File("D:/tmp/c.txt")),"utf-8"
						)
				);
				
		String info = null;
		while(null!=(info=br.readLine())) System.out.println(info);
		br.close();
	}
}
