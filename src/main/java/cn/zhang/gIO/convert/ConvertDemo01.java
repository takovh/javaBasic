package cn.zhang.gIO.convert;

import java.io.UnsupportedEncodingException;

/**
 * 解码与编码字符集不统一或字节数不完整会造成乱码
 * @author tako_
 *
 */
public class ConvertDemo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "一二三abc123";//GBK
		//编码1：char-(GBK)->byte
		byte[] data1 = str.getBytes();
		//解码1：byte-(GBK)->char
		System.out.println(new String(data1));//解码与编码字符集统一
		
		//编码2：char-(utf-8)->byte
		byte[] data2 = str.getBytes("utf-8");//设定编码字符集
		//解码2：byte-(GBK)->char
		System.out.println(new String(data2));//解码与编码字符集不统一
		
		//编码3：char-(utf-8)->byte
		byte[] data3 = str.getBytes("utf-8");//设定编码字符集
		//解码3：byte-->char
		System.out.println(new String(data3, "utf-8"));//不指定则默认GBK
		
	}
}
