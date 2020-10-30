package cn.takovh.javaBasic.c_08_Thread.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 倒计时
 * 1.倒数10个数，一秒打印一个
 * 2.
 * @author tako_
 *
 */
public class SleepDemo01 {
	public static void main(String[] args) throws InterruptedException{
		//test01();
		Date endTime = new Date(System.currentTimeMillis()+10*1000);
		long end = endTime.getTime();
		while(true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			endTime = new Date(endTime.getTime()-1000);
			Thread.sleep(1000);
			if(end-10000>endTime.getTime()) break;
		}
	}
	
	//倒计时10个数
	public static void test01() throws InterruptedException {
		int num = 10;
		for( ;num>0;num--) {
			System.out.println(num);
			Thread.sleep(1000);//暂停
		}
	}
}
