package cn.takovh.javaBasic.c_06_Collection.generic01;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的入门
 * 1.泛型：标签、泛化类型
 * 2.作用：省心、安全（安全检查）
 * @author 张煜
 *
 */
public class Simple {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//安全
		//list.add(1);//类型检查
		list.add("so easy!");
		//省心
		String ele = list.get(0);
		System.out.println(ele);
	}
}
