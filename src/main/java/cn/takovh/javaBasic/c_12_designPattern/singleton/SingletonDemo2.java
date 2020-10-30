package cn.takovh.javaBasic.c_12_designPattern.singleton;

/**
 * 懒汉式单例模式
 * @author tako_
 *
 */
public class SingletonDemo2 {
	private static SingletonDemo2 instance;
	private SingletonDemo2() {}

	/**
	 * 最简单的实现方式
	 * 非线程安全
	 * @return
	 */
	public static SingletonDemo2 getInstance() {
		if(instance==null) {
			doSomething();//业务代码
			instance = new SingletonDemo2();
		}
		return instance;
	}

	/**
	 * 锁的粒度太粗
	 * 效率低
	 * @return
	 */
	public static synchronized SingletonDemo2 getInstance1() {
		doSomething();//业务代码
		if(instance==null) {
			doSomething();//业务代码
			instance = new SingletonDemo2();
		}
		return instance;
	}

	/**
	 * double check lock (DCL)
	 * 外层判断可以避免每次调用都竞争锁，提高效率
	 * 内层判断可避免等待锁的线程进入，继续new实例
	 * @return
	 */
	public static SingletonDemo2 getInstance2() {
		doSomething();//业务代码
		if(instance==null) {
			synchronized (SingletonDemo2.class){
				if(instance==null){
					doSomething();//业务代码
					instance = new SingletonDemo2();
				}
			}
		}
		return instance;
	}

	private static void doSomething(){
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			new Thread(()->{
				System.out.println(SingletonDemo2.getInstance().hashCode());
			}).start();
		}
	}
}
