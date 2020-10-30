package cn.takovh.javaBasic.c_02_OOP.test;

public class Test {
	public static void main(String args[]){
		Point p1=new Point();
		Point p2=new Point(1,1);
		
		Circle c1=new Circle(); 
		Circle c2=new Circle(1,1,2); 
		Circle c3=new Circle(p1,3); 
		Circle c4=new Circle(p2,3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
