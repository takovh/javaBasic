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
		Thread proxy = new Thread(it,"°¤Ìß");
		proxy.setName("test");
		System.out.println(proxy.getName());
		System.out.println(Thread.currentThread().getName());//main
		proxy.start();
		System.out.println("Æô¶¯ºóµÄ×´Ì¬£º" + proxy.isAlive());
		Thread.sleep(2);
		it.stop();
		Thread.sleep(1);
		System.out.println("Í£Ö¹ºóµÄ×´Ì¬£º" + proxy.isAlive());
	}
}
