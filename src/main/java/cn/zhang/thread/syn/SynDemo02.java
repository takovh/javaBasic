package cn.zhang.thread.syn;

/**
 * 单例设计模式：确保一个类只有一个对象
 * 
 * @author tako_
 *
 */
public class SynDemo02 {
	public static void main(String[] args) {
		
	}
}

/**
 * 单例设计模式
 * 确保一个类只有一个对象
 * 懒汉式
 * 1.构造器私有化，避免外部直接创建对象
 * 2.声明一个私有的静态变量
 * 3.创建一个对外的公共的静态方法访问该变量，如果变量没有对象，创建该对象
 * @author tako_
 *
 */
class Jvm{
	//声明一个私有的静态变量
	private static  Jvm instance = null;
	//构造器私有化，避免外部直接创建对象
	private Jvm() {	}
	public static Jvm getInstance() {
		if(null==instance) {
			instance = new Jvm();
		}
		return instance;
	}
}