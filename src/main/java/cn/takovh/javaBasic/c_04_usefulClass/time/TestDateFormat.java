package cn.takovh.javaBasic.c_04_usefulClass.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 抽象类不能实例化，不能用new来实例化抽象类
 * 抽象类只能用来继承
 * 抽象方法必须被子类实现
 * DateFormat是抽象类,需要靠子类SimpleDateFormat来实现
 * 时间：yyyy-MM-dd hh:mm:ss
 * @author 张煜
 */
public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df0 = new SimpleDateFormat("yyyy年MM月dd日");
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = new Date(System.currentTimeMillis());
		String [] str = {
				df0.format(d),//将Date按格式转化为字符串，format方法返回该对象所制定格式的字符串
				df1.format(d) //将Date按格式转化为字符串，format方法返回该对象所制定格式的字符串
		};
		for(String e : str) System.out.println(e);
		
		try {
			Date d0 = df0.parse(str[0]);//将字符串按格式转化为Date，一定要对应匹配
			Date d1 = df1.parse(str[1]);//将字符串按格式转化为Date，一定要对应匹配
			System.out.println(d0);
			System.out.println(d1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
