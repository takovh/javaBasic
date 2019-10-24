package cn.zhang.collection.others;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties输出到文件
 * 也就是资源配置文件：
 * 1. .properties
 * store(out, comments)
 * 
 * 2. .xml 
 * storeToXML(os, comment)
 * 
 * @author tako_
 *
 */
public class PropertiesDomo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//创建对象
		Properties pro = new Properties();
		//存储
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user","Scott");
		pro.setProperty("pwd","123");
		
		//使用绝对路径,输出到d:/tmp
		//pro.store(new FileOutputStream(new File("d:/tmp/db.properties")), "db配置");
		//pro.storeToXML(new FileOutputStream(new File("d:/tmp/db.properties")), "db配置");
		
		//使用相对路径,输出到当前工程
		pro.store(new FileOutputStream(new File("src/cn/zhang/collection/others/db.properties")), "db配置");
		pro.storeToXML(new FileOutputStream(new File("src/cn/zhang/collection/others/db.xml")), "db配置");
	}
}
