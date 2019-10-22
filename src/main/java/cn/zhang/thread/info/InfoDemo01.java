package cn.zhang.thread.info;
/**
 * Thread.currentThread()
 * setName()
 * getName()
 * isAlive()
 * @author tako_
 *
 */
public class InfoDemo01 {
	public static void main(String[] args) throws InterruptedException {
		MyThread it = new MyThread();
		Thread proxy = new Thread(it,"挨踢");
		proxy.setName("test");
		System.out.println(proxy.getName());
		System.out.println(Thread.currentThread().getName());//main
		proxy.start();
		System.out.println("启动后的状态：" + proxy.isAlive());
		Thread.sleep(2);
		it.stop();
		Thread.sleep(1);
		System.out.println("停止后的状态：" + proxy.isAlive());
	}
}
