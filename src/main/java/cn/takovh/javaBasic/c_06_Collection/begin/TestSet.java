package cn.takovh.javaBasic.c_06_Collection.begin;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试Set常用方法
 * @author 张煜
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		System.out.println(set.size());
		set.remove("aaa");
		System.out.println(set.contains("aaa"));
	}
}
