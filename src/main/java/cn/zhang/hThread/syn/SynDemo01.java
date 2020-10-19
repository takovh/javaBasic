package cn.zhang.hThread.syn;

public class SynDemo01 {
	public static void main(String[] args) {
		//真实角色
		Web12306 web = new Web12306();
		//代理
		Thread t1 = new Thread(web, "路人甲");
		Thread t2 = new Thread(web, "黄牛1");
		Thread t3 = new Thread(web, "黄牛2");
		
		t1.start();
		t2.start();
		t3.start();
	}	
}

class Web12306 implements Runnable {
	private int num = 100;
	private boolean flag = true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag) {
			//test01();//不安全
			test02();//安全
			//test03();//安全
		}
	}
	
	//线程不安全的
	public void test01() {
		if(num<=0) {
			flag = false;
		}else {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "抢到了，余票" + --num);
		}		
	}
	//线程安全的
	public synchronized void test02() {
		if(num<=0) {
			flag = false;
		}else {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "抢到了，余票" + --num);
		}
	}
	
	//线程安全的
	public synchronized void test03() {
		synchronized(this) {
			if(num<=0) {
				flag = false;
			}else {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "抢到了，余票" + --num);
			}
		}	
	}
}