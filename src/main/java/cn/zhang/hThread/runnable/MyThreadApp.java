package cn.zhang.hThread.runnable;

import org.junit.Test;


public class MyThreadApp {

	/**
	 * Thread.currentThread()
	 * setName()
	 * getName()
	 * isAlive()
	 * @author tako_
	 *
	 */
	@Test
	public void test01() throws InterruptedException {
		MyThread it = new MyThread();
		Thread proxy = new Thread(it,"挨踢");
		proxy.setName("test");
		System.out.println("proxy.getName: " + proxy.getName());
		System.out.println("currentThread: " + Thread.currentThread().getName());//main
		proxy.start();
		System.out.println("启动后的状态isAlive()：" + proxy.isAlive());
		Thread.sleep(2);
		it.stop();
		Thread.sleep(1);
		System.out.println("停止后的状态isAlive()：" + proxy.isAlive());
	}

	/**
	 * 优先级(代表概率而不是先后)
	 * MAX_PRIORITY 10
	 * NORM_PRIORITY 5
	 * MIN_PRIORITY 1
	 *
	 * setPriority()
	 * getPriority()
	 * @author tako_
	 *
	 */
	@Test
	public void test02() throws InterruptedException {
		MyThread it1 = new MyThread();
		Thread p1 = new Thread(it1,"挨踢1");
		MyThread it2 = new MyThread();
		Thread p2 = new Thread(it2,"挨踢2");

		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		p1.start();
		p2.start();

		Thread.sleep(50);
		it1.stop();
		it2.stop();
	}
}
