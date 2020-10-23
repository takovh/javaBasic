package cn.zhang.bOOP.polymorphism.test03;

public class Teacher extends Person{
	public String name;//父类拥有的字段
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
