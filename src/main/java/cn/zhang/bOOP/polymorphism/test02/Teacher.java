package cn.zhang.bOOP.polymorphism.test02;

public class Teacher extends Person{
	
	public Teacher() {
	
	}
	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				'}';
	}
}
