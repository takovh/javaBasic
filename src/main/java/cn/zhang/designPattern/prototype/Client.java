package cn.zhang.designPattern.prototype;

import java.util.Date;

/**
 * 测试原型模式(浅克隆)
 * @author tako_
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date =  new Date(12312323131L);
		Sheep s1 = new Sheep("shaoli", date);
		Sheep s2 = (Sheep) s1.clone();
		
		date.setTime(999999999999L);
		System.out.println(s1);
		System.out.println(s1.getInfo());
		
		s2.setSname("duoli");
		System.out.println(s2);
		System.out.println(s2.getInfo());
	}
}
