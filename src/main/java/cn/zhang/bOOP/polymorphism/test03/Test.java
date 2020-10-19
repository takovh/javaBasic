package cn.zhang.bOOP.polymorphism.test03;

public class Test {
	public static void main(String[] args) {
		
		Teacher tea = new Teacher("ttt");
		System.out.println("tea.name = " + tea.name);
		System.out.println("*****************");
		
		Student stu=new Student(tea,"sss");
		System.out.println("stu.name = " + stu.name);
		System.out.println("stu.headTeacher.name = " + stu.headTeacher.name);
		//stu.headTeacher.name = null
		System.out.println("*****************");
		
		stu.print();

	}
}
