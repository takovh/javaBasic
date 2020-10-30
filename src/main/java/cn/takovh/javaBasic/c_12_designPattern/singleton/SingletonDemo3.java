package cn.takovh.javaBasic.c_12_designPattern.singleton;

/**
 * 静态内部类实现单例模式
 * 线程安全且调用效率高
 * @author tako_
 *
 */
public class SingletonDemo3 {
	private static class SingletonClassInstance {
		private static final SingletonDemo3 instance = new SingletonDemo3();
	}
	private SingletonDemo3() {
		
	}
	public static synchronized SingletonDemo3 getInstance() {
		return SingletonClassInstance.instance;
	}
}
