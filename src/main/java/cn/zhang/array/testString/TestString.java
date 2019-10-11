package cn.zhang.array.testString;

public class TestString {
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(str);
		System.out.println("Abc".equalsIgnoreCase("abc"));
		System.out.println("Abcbd".indexOf('b'));
		System.out.println("Abcbd".lastIndexOf('b'));
		System.out.println("Abcbd".startsWith("Ab"));
		System.out.println("Abcbd".endsWith("bd"));
		System.out.println("Abcbd".toLowerCase());
		System.out.println("Abcbd".toUpperCase());
	}
}
