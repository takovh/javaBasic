package cn.zhang.fCollection.begin;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的基本用法
 * @author 张煜
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String,Student> map = new HashMap<String,Student>();
		map.put("A5238108", new Student("zhangyu"));
		Student s = (Student)map.get("A5238108");
		System.out.println(s.name);
	}
}

class Student{
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
}
