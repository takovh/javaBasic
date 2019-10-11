package cn.zhang.pattern.singleton;

public class Client {
	public static void main(String[] args) {
		SingletonDemo1 s11 = SingletonDemo1.getInstance();
		SingletonDemo1 s12 = SingletonDemo1.getInstance();
		System.out.println(s11);
		System.out.println(s12);
		
		SingletonDemo2 s21 = SingletonDemo2.getInstance();
		SingletonDemo2 s22 = SingletonDemo2.getInstance();
		System.out.println(s21);
		System.out.println(s22);
		
		SingletonDemo3 s31 = SingletonDemo3.getInstance();
		SingletonDemo3 s32 = SingletonDemo3.getInstance();
		System.out.println(s31);
		System.out.println(s32);
		
		System.out.println(SingletonDemo4.INSTANCE);
		System.out.println(SingletonDemo4.INSTANCE);
	}
}
