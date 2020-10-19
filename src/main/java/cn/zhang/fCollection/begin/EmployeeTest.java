package cn.zhang.fCollection.begin;

import java.util.ArrayList;
import java.util.List;

/**
 * javabean
 * 一个对象代表一行记录
 * @author 张煜
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee(0301, "高琪", 3000, "项目部", "2010-10");
		Employee e1 = new Employee(0302, "马士兵", 3500, "教学部", "2010-10");
		Employee e2 = new Employee(0302, "裴新", 3500, "教学部", "2010-10");
		
		/**
		 * List<>表示泛型
		 */
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		for(Employee element : list) System.out.println(element.getName());
	}

}
