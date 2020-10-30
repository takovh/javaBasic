package cn.takovh.javaBasic.c_03_array.testString;

public class TestString {
	public void testMethods(){
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

	public void testEqual(){
		String s0 = "ss";
		String s1 = new String("ss");
		String s2 = new String("ss");
		System.out.println(s0==s1);
		System.out.println(s2==s1);
	}

	public int countSubStrings(String str, String sub){
		int count = 0;
		return count;
	}

	public static void main(String[] args) {
		TestString test = new TestString();
		test.testEqual();
	}
}
