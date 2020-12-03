package cn.takovh.javaBasic.c_16_algorithm.sort.innerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("==============String排序===============");
		String[] arr = {"a","abcd","abc","def"};
		Utils.sort(arr);//降序
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==============List排序===============");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Utils.sort(list);
		System.out.println(list);
		
		System.out.println("==============使用Comparator排序数组===============");
		String[] arr2 = {"a","abcd","abc","def"};
		Utils.sort(arr2, new StringCompare());//降序
		System.out.println(Arrays.toString(arr2));
	}
}
