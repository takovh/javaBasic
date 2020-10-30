package cn.takovh.javaBasic.c_08_Thread.syn;

/**
 * 同一份资源被多个线程synchronize使用容易造成死锁
 * @author tako_
 *
 */
public class SynDemo03 {
	public static void main(String[] args) {
		Object g = new Object();
		Object m = new Object();
		Test01 t1 = new Test01(g, m);
		Test02 t2 = new Test02(g, m);
		Thread proxy1 = new Thread(t1);
		Thread proxy2 = new Thread(t2);
		proxy1.start();
		proxy2.start();
	}
}

//交钱
class Test01 implements Runnable {
	Object goods;
	Object money;	
	public Test01(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}
	@Override
	public void run() {
		while(true) {
			test();
		}
	}
	public void test() {
		synchronized(goods) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(money) {
				
			}	
		}
		System.out.println("一手交钱");
	}
}

//交货
class Test02 implements Runnable{
	Object goods;
	Object money;	
	public Test02(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}
	@Override
	public void run() {
		while(true) {
			test();
		}
	}
	public void test() {
		synchronized(money) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(goods) {
				
			}	
		}
		System.out.println("一手交货");
	}
}
