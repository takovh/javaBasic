package cn.zhang.thread.create;

public class Web12306 implements Runnable {
	private int num = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(num<=0) {
				break;
			}
			System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
		}
	}
	public static void main(String[] args) {
		
		//真实角色
		Web12306 web = new Web12306();
		//代理
		Thread t1 = new Thread(web, "路人甲");
		Thread t2 = new Thread(web, "路人乙");
		Thread t3 = new Thread(web, "路人丙");
		t1.start();
		t2.start();
		t3.start();
	}
}
