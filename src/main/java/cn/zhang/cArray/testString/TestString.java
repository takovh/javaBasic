package cn.zhang.cArray.testString;

public class TestString {
	public static void main(String[] args) {
		String str = "ab cd";
		System.out.println(str);

		// length=5
		System.out.println(str.length());

		// split
		String[] ss = str.split(" ");
		System.out.println(ss[0] + " " + ss[1]);

		System.out.println("Abc".equalsIgnoreCase("abc"));
		System.out.println("Abcbd".indexOf('b'));
		System.out.println("Abcbd".lastIndexOf('b'));
		System.out.println("Abcbd".startsWith("Ab"));
		System.out.println("Abcbd".endsWith("bd"));
		System.out.println("Abcbd".toLowerCase());
		System.out.println("Abcbd".toUpperCase());
	}
}
