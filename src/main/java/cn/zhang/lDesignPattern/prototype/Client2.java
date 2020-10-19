package cn.zhang.lDesignPattern.prototype;

import java.util.Date;

/**
 * 测试原型模式(深克隆)
 * @author tako_
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date =  new Date(12312323131L);
		Sheep2 s1 = new Sheep2("shaoli", date);
		Sheep2 s2 = (Sheep2) s1.clone();
		
		date.setTime(999999999999L);
		System.out.println(s1);
		System.out.println(s1.getInfo());
		
		s2.setSname("duoli");
		System.out.println(s2);
		System.out.println(s2.getInfo());
	}
}
