package cn.takovh.javaBasic.c_08_Thread.e_00_threadBasic.runnable;
/**
 * 
 * @author tako_
 *
 */
public class MyThread implements Runnable {
	private boolean flag = true;
	private int num = 0;
	@Override
	public void run() {
		while(flag) {
			System.out.println(Thread.currentThread().getName() + "-->" + num++);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void stop() {
		this.flag = !this.flag;
	}

}
