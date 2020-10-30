package cn.takovh.javaBasic.c_03_array.testString;
/**
 * String：不可变字符序列
 * 测试可变字符序列。StringBuilder（线程不安全，效率高），StringBuffer（线程安全，效率低）
 * @author 张煜
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		//StringBuilder转String
		StringBuilder sb = new StringBuilder("1234");
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		
		StringBuilder sb1 = new StringBuilder();//字符数组长度初始为16
		StringBuilder sb2 = new StringBuilder(32);//字符数组长度初始为32
		StringBuilder sb3 = new StringBuilder("abcd");//字符数组长度初始为32，value[]={'a','b','c','d',\u0000,\u0000,...}
		sb3.append("efg");//abcdefg
		sb3.append(true);//abcdefgtrue
		sb3.append("123").append("456");//通过return this 实现方法链
		
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		System.out.println(sb3);
		
		System.out.println("#####################");
		StringBuilder sb4 = new StringBuilder("a");
		for(int i = 0;i < 10;i++) sb4.append(i);
		System.out.println(sb4);
		
		System.out.println("#####################");
		sb3.reverse();
		sb4.delete(0, 1);
		System.out.println(sb3);
		System.out.println(sb4);
	}
}
