package cn.zhang.thread.create;

/**
 * 
 * @author tako_
 *
 */
public class ProgrammerApp {
	
	public static void main(String[] args) {
		
		//1）创建真实角色
		Programmer pgm = new Programmer();
		// 2）创建代理角色 + 真实角色引用
		Thread proxy = new Thread(pgm);
		//	3）调用.start()启动线程
		proxy.start();
		
		for(int i=0;i<100;i++) System.out.println("聊QQ中。。。");
	}
}
