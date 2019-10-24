package cn.zhang.pattern.singleton;

/**
 * 测试饿汉式单例模式
 * 线程安全
 * @author tako_
 *
 */
public class SingletonDemo1 {
	private static SingletonDemo1 instance = new SingletonDemo1();//类初始化时立即加载这个对象
	private SingletonDemo1() {
		
	}
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
