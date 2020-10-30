package cn.takovh.javaBasic.c_06_Collection.generic03;

import java.util.ArrayList;
import java.util.List;

/**
 * ? -->通配符，类型不确定，用于声明变量或形参上
 * @author tako_
 *
 */
public class WildCardsTest {
	public static void main(String[] args) {
		//声明
		List<?> list; 
		list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		test(list);
	}
	public static void test(List<?> list) {
		
	}
}
