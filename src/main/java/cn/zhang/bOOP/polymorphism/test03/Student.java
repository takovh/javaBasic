package cn.zhang.bOOP.polymorphism.test03;

public class Student extends Person{
	public String name;//父类拥有的字段
	public Person headTeacher;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(Person headTeacher, String name) {
//		this.headTeacher.name = headTeacher.name; //构造失败
		this.headTeacher = headTeacher;//由于共有字段问题，构造失败this.headTeacher=null
		this.name = name;
	}
	
	public void print() {
		System.out.println("stu.name = " + name);
		System.out.println("headTeacher.name = " + headTeacher.name);
	}
   
}
