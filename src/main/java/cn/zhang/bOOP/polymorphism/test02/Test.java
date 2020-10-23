package cn.zhang.bOOP.polymorphism.test02;

public class Test {
	public static void main(String[] args) {
		
		Teacher tea = new Teacher("ttt");
		System.out.println(tea);
		System.out.println("*****************");
		
		Student stu=new Student(tea,"sss");
		System.out.println(stu);
		System.out.println("*****************");
		
	}
}
