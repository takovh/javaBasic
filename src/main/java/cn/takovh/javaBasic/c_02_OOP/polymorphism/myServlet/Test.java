package cn.takovh.javaBasic.c_02_OOP.polymorphism.myServlet;

public class Test {
	public static void main(String[] args) {
		HttpServlet s = new MyServlet();
		s.service();
	}
}
