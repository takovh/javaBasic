package cn.zhang.oop.polymorphism.test02;

public class Student extends Person{

	public Person headTeacher;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(Person headTeacher, String name) {
//		this.headTeacher.name = headTeacher.name; 
		this.headTeacher = headTeacher;
		this.name = name;
	}
	
	public void print() {
		System.out.println("stu.name = " + name);
		System.out.println("headTeacher.name = " + headTeacher.name);
	}
   
}
