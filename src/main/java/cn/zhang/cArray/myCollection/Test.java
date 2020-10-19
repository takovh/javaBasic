package cn.zhang.cArray.myCollection;
/**
 * 模拟实现JDK中提供的ArrayList类
 * @author 张煜
 *
 */
public class Test {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("a");
		list.add(new Human("zhangyu"));
		Human h = (Human)list.get(1);
		
		System.out.println(list.get(0));
		System.out.println(h.getName());
		System.out.println(list.size());
	}
}
