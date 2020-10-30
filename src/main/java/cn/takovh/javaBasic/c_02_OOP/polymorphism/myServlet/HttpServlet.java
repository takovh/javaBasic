package cn.takovh.javaBasic.c_02_OOP.polymorphism.myServlet;

public class HttpServlet {
	public void service() {
		System.out .println("HttpServlet.service()");
		doGet();
	}
	public void doGet() {
		System.out .println("HttpServlet.doGet()");
	}
}
