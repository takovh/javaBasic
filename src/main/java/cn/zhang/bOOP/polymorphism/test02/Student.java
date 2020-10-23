package cn.zhang.bOOP.polymorphism.test02;

public class Student extends Person{

	public Person headTeacher;
	
	public Student(Person headTeacher, String name) {
		this.headTeacher = headTeacher;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"stu.name='" + name + '\'' +
				", headTeacher.name='" + headTeacher.name + '\'' +
				'}';
	}


}
