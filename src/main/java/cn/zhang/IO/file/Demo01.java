package cn.zhang.IO.file;

import java.io.File;

/**
 * 两个常量：
 * 1.路径分隔符
 * 2.名称分隔符
 * 
 * 相对路径与绝对路径构造File对象
 * @author tako_
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//路径表示形式
		String path = "D:\\tmp\\1.jpg";//转义字符问题
		path = "D:" + File.separator + "tmp" + File.separator + "1.jpg";//跨平台
		path = "D:/tmp/1.jpg";//推荐方式：替换为/
		System.out.println(path);
		
		String parentPath = "D:/tmp";
		String name = "1.jpg";
		//相对路径
		File src = new File(parentPath,name);
		src = new File(new File(parentPath),name);
		//输出
		System.out.println(src.getName());
		System.out.println(src.getPath());
		//绝对路径
		src = new File("D:/tmp/1.jpg");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		//没有盘符：以user.dir构建
		src = new File("1.jpg");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
	}
}
