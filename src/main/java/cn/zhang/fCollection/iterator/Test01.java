package cn.zhang.fCollection.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		/**
		 * while循环方法
		 */
		System.out.println("*************while循环方法*************");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = (String)iter.next();//返回当前指向的对象并指向下一个对象
			System.out.println(str);
		}
		
		/**
		 * for循环方法
		 */
		System.out.println("*************for循环方法*************");
		for(Iterator<String> iter2=set.iterator();iter2.hasNext(); ) {
			String str = (String)iter2.next();
			System.out.println(str);
		}
	}
}
