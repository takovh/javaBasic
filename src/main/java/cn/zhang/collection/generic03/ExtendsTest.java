package cn.zhang.collection.generic03;

import java.util.ArrayList;
import java.util.List;

/**
 * extends：泛型的上限<= 即子类或自身
 * 1.一般用于限制操作
 * 2. 不能使用在添加数据上，一般都是读取操作
 * 3.规则：
 * 	List<Fruit> -->List<? extends Fruit>
 *  List<Apple> -->List<? extends Fruit>
 *  List<? extends Apple> -->List<? extends Fruit>
 *  不能存放：
 *  List<?>
 *  List<? extends Object>
 * 
 * @author tako_
 *
 */

public class ExtendsTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//extends为上限
		Test<Fruit> t1 = new Test<Fruit>();
		Test<Apple> t2 = new Test<Apple>();
		Test<Pear> t3 = new Test<Pear>();
		
		//调用方法
		List<? extends Fruit> list1 = new ArrayList<Fruit>();
		test(list1);
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);
		List<Apple> list3 = new ArrayList<Apple>();
		test(list3);
		//? extends Apple
		List<? extends Apple> list4 = new ArrayList<FujiApple>();
		test(list4);
		//?为什么不行？因为<?>等同于<? extends Object>
		List<?> list5 = new ArrayList<Fruit>();
		List<? extends Object> list6 = new ArrayList<Fruit>();
		//test(list5);
	}
	
	//? extends Fruit
	public static void test(List<? extends Fruit> list) {
		/*list.add(new Apple());
		list.add(new FujiApple());
		list.add(new Pear());
		list.add(new Fruit());*/
		
		list.addAll(null);
	}
	//泛型类
	static class Test<T extends Fruit>{
		
	}
}
