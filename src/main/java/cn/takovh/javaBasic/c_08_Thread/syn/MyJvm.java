package cn.takovh.javaBasic.c_08_Thread.syn;

/**
 * 单例创建的方式
 * 1.懒汉式
 * 1).构造器私有化，避免外部直接创建对象
 * 2).声明一个私有的静态变量
 * 3).创建一个对外的公共的静态方法访问该变量，如果变量没有对象，创建该对象
 * @author tako_
 *
 */
public class MyJvm {
	private static MyJvm instance = null;
	private MyJvm() {}
	public static MyJvm getInstance() {
		if(null==instance) {//第一次检查：提高效率
			synchronized(MyJvm.class) {
				if(null==instance) {//第二次检查：安全
					instance = new MyJvm();
				}
			}
		}
		return instance	;
	}
}

/**
 * 饿汉式
 * 1).构造器私有化
 * 2).声明一个私有的静态属性，同时创建该对象
 * 3).对外提供访问属性的静态方法
 * @author tako_
 *
 */
class MyJvm2 {
	private static MyJvm2 instance = new MyJvm2();
	private MyJvm2() {}
	public static MyJvm2 getInstance() {
		return instance	;
	}
}

/**
 * 类在使用的时候加载，延缓了加载时间
 * 因为属性一开始就会初始化，方法在加载时初始化
 * @author tako_
 *
 */
class MyJvm3 {
	private static class JVMholder{
		private static MyJvm3 instance = new MyJvm3();
	}
	private MyJvm3() {}
	public static MyJvm3 getInstance() {
		return JVMholder.instance;
	}
}
