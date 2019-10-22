package cn.zhang.thread.create;

/**
 * 
 * @author tako_
 *
 */
public class RabbitApp {
	public static void main(String[] args) {
		//1.创建子类对象
		Rabbite rbt = new Rabbite();
		Tortoise tts = new Tortoise();
		//2.调用start方法
		rbt.start();
		tts.start();
	}
	
}
