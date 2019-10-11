package cn.zhang.IO.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 常用方法
 * 1.文件名
 * 2.判断信息
 * 3.长度字节数（不能读取文件夹的长度）
 * 4.创建、删除文件
 * 5.操作目录
 * @author tako_
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//test01();
		//test02();
		/*try {
			test03();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//test04();
		test05();
	}
	
	//文件名
	public static void test01() {
		File src = new File("D:/tmp/1.jpg");
		System.out.println(src.getName());//返回名称
		System.out.println(src.getPath());//如果是绝对路径，返回完整路径；否则返回相对路径
		System.out.println(src.getAbsolutePath());//返回绝对路径
		System.out.println(src.getParent());//返回上一级目录，如果是相对，返回null
	}
	
	//判断信息
	public static void test02() {
		String parentPath = "D:/tmp";
		String name = "1.jpg";
		System.out.println("********是文件********");
		File src = new File(parentPath,name);
		System.out.println("文件是否存在：" + src.exists());
		System.out.println("是文件夹？" + src.isDirectory());
		System.out.println("是文件？" + src.isFile());
		System.out.println("长度为：" + src.length());
		
		System.out.println("********是文件夹********");
		src = new File(parentPath);
		System.out.println("文件是否存在：" + src.exists());
		System.out.println("文件是否可写：" + src.canWrite());
		System.out.println("是文件夹？" + src.isDirectory());
		System.out.println("是文件？" + src.isFile());
		System.out.println("长度为：" + src.length());
	}
	
	//创建、删除文件
	public static void test03() throws IOException, InterruptedException {
		String path = "D:/tmp/1.jpg";
		File src = new File(path);
		
		//创建文件
		if(!src.exists()) {
			boolean flag = src.createNewFile();
			System.out.println(flag?"创建成功！":"创建失败！");
		}
		
		//删除文件
		boolean flag = src.delete();
		System.out.println(flag?"删除成功！":"删除失败！");
		
		//创建临时文件
		//static createTempFile(前缀3个字节长，后缀默认.temp)默认临时空间
		//static createTempFile(前缀3个字节长，后缀默认.temp，目录）
		File temp = File.createTempFile("tes", ".temp" ,new File("D:/tmp"));
		Thread.sleep(10000);
		temp.deleteOnExit();
	}
	
	//文件夹操作
	public static void test04() {
		String path1 = "D:/tmp/test";
		File src = new File(path1);
		src.mkdir();//父目录不存在会创建失败
		src.mkdirs();//父目录链不存在也会一同创建
	}
	
	//文件列表 [文件|文件夹]
	public static void test05() {
		String path = "D:/tmp";
		File src = new File(path);
		if(src.isDirectory()) {
			String[] subNames = src.list();
			for(String temp:subNames) System.out.println(temp);
		}
		
		System.out.println("======子目录|文件File对象======");
		File[] subFiles = src.listFiles();
		for(File temp:subFiles) System.out.println(temp.getAbsolutePath());
				
		System.out.println("======子文件.mp3对象======");
		//命令设计模式
		subFiles = src.listFiles(new FilenameFilter() {
			@Override
			//dir代表src
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile()&&name.endsWith(".mp3");
			}
		});
		for(File temp:subFiles) System.out.println(temp.getAbsolutePath());
	}
}
