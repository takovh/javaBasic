package cn.zhang.collection.others;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties读取配置文件
 * 资源配置文件：
 * load(inStream)
 * @author tako_
 *
 */
public class PropertiesDemo03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		//读取相对路径
		pro.load(new FileReader("src/cn/zhang/collection/others/db.properties"));
		System.out.println(pro.getProperty("user","default"));
	}
}
