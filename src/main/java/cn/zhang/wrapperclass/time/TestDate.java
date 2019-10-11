package cn.zhang.wrapperclass.time;

import java.util.Date;

/**
 * 测试时间类的用法
 * @author 张煜
 *
 */
public class TestDate {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		Date [] d = new Date[4];
		d[0] = new Date();//缺省值为当前时间
		d[1] = new Date(System.currentTimeMillis());
		d[2] = new Date(t);
		d[3] = new Date(1541059015319L);//long型数字要加L
		
		
		for(Date e : d) System.out.println(e);
		System.out.println(t);
		System.out.println(d[0].getTime());
	}
}
