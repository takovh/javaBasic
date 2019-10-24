package cn.zhang.wrapperclass.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author 张煜
 *
 */
public class VisualCalendar {
	public static void main(String[] args) {
		System.out.println("请输入日期：（yyyy-MM-dd)");
		Scanner s = new Scanner(System.in);//申明了名为SC的数据输入扫描仪（Scanner），从而获得了配置内存
		String test = s.nextLine();
		s.close();//使用Scanner后，结束数据流，释放内存	
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			
		try {
			Date d = df.parse(test);//将String转为Date
			Calendar c = new GregorianCalendar();
			c.setTime(d);//将Date格式化为公历
			int day = c.get(Calendar.DATE);
			
			c.set(Calendar.DATE, 1);
			int day_of_week = c.get(Calendar.DAY_OF_WEEK);//Calendar.SUNDAY;周日是1
			int max_days_in_month = c.getActualMaximum(Calendar.DATE);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for(int i = 1;i<day_of_week;i++) System.out.print("\t");
			for(int i = 1;i<=max_days_in_month;i++) {
				if(i == day) System.out.print("*");
				System.out.print(i+"\t");
				int w = c.get(Calendar.DAY_OF_WEEK);
				if(w == Calendar.SATURDAY) System.out.print('\n');
				c.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
