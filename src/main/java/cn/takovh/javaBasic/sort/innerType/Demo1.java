package cn.takovh.javaBasic.sort.innerType;

/**
 * 内置类型比较
 * @author tako_
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		Integer i = 1;
		Integer j = 2;
		System.out.println(i.compareTo(j));
		Character ch1 = 'a';
		Character ch2 = 'b';
		System.out.println(ch1.compareTo(ch2));
		String str1 = "abc";
		String str2 = "abc123";
		System.out.println(str1.compareTo(str2));
	}
}
