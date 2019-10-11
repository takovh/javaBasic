package cn.zhang.array.testString;

/**
 * String：不可变字符序列
 * 测试可变字符序列。StringBuilder（线程不安全，效率高），StringBuffer（线程安全，效率低）
 * @author 张煜
 *
 */

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234");
		System.out.println(sb);
		String str = "" + sb;
		String str2 = sb.reverse().toString();
		System.out.println(str+str2);
	}
}
