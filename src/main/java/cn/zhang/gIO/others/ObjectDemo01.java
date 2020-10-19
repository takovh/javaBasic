package cn.zhang.gIO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 不是所有的对象都可以序列化
 * 不是所有的属性都需要序列化
 * @author tako_
 *
 */
public class ObjectDemo01 {
	public static void main(String[] args) {
		try {
			seri("D:/tmp/d.txt");
			reseri("D:/tmp/d.txt");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//序列化
	public static void seri(String destPath) throws IOException {
		Employee emp = new Employee("zhangyu",10000);
		// 创建源
		File dest = new File(destPath);
		//ObjectOutputStream
		ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		// 操作
		dos.writeObject(emp);
		dos.close();
	}
	
	//反序列化
	public static void reseri(String destPath) throws IOException, ClassNotFoundException {
		//创建源
		File src = new File(destPath);
		//选择流
		ObjectInputStream dis = new ObjectInputStream(
					new BufferedInputStream(
								new FileInputStream(src)
							)
				);
		//操作：读取的顺序必须与写出一致 必须存在才能读取
		Object obj = dis.readObject();
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		
		dis.close();
	}
}
