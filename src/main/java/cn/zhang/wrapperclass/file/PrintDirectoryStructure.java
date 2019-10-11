package cn.zhang.wrapperclass.file;

import java.io.File;

public class PrintDirectoryStructure {
	public static void main(String[] args) {
		File f = new File("f:/BaiduNetdiskDownload");
		printFile(f,0);
	}
	public static void printFile(File file,int level) {
		for(int i = 0;i < level;i++) System.out.print("-");
		System.out.println(file.getName());
		
		if(file.isDirectory()) {
			File [] files = file.listFiles();
			for(File e : files) printFile(e,level+1);
		}
	}
}
