package cn.zhang.fCollection.others;

import java.util.Properties;

/**
 * Properties资源配置文件的读写
 * 1.key与value只能为字符串
 * 2.存储与读取
 * 	setProperty(key, value)
 * 	getProperty(key)
 * @author tako_
 *
 */
public class PropertiesDemo01 {
	public static void main(String[] args) {
		//创建对象
		Properties pro = new Properties();
		//存储
		pro.setProperty("driver", "oracle.nJDBC.driver.OracleDriver");
		pro.setProperty("url", "nJDBC:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user","Scott");
		pro.setProperty("pwd","123");
		
		//获取
		String url = pro.getProperty("url","default");
		System.out.println(url);
		
	}
}
