package cn.takovh.javaBasic.c_03_array.cmdargs;

public class TestCmdArgs {
	public static void main(String[] args) {
		for(int i = 0;i < args.length;i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
	}
}
