package cn.takovh.javaBasic.c_04_usefulClass.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试Calendar类的使用
 * Calendar是抽象类
 * GregorianCalendar是他的子类
 * @author 张煜
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.MONTH, Calendar.OCTOBER);
		c.set(2018, Calendar.NOVEMBER, 1);
		c.setTime(new Date(1234567890123L));
		
		Date d = c.getTime();
		System.out.println(d);
		System.out.println("一年的第"+c.get(Calendar.WEEK_OF_YEAR)+"周");
		
		c.add(Calendar.DAY_OF_YEAR, 78);
		
		d = c.getTime();
		System.out.println(d);
		System.out.println("一年的第"+c.get(Calendar.WEEK_OF_YEAR)+"周");
		
	}
}
