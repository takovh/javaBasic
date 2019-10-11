package cn.zhang.oop.test;

public class Circle {
	private Point position;
	private int radius;
	private double perimter;
	private double area;
	
	public Circle(){ 
		position = new Point();
		radius = 1;
		perimter = perimter();
		area = area();
	}
	public Circle(int xx,int yy,int r){ 
		position = new Point(xx,yy);
		radius = r;
		perimter = perimter();
		area = area();
	}
	public Circle(Point c,int r) { 
		position = c;
		radius=r;
		perimter = perimter();
		area = area();
	}
	public double perimter(){
		return (2*Math.PI*radius);
	}
	public double area(){
		return (Math.PI*radius*radius);
	}
	public Point getPosition() {
		return position;
	}
	public int getRadius() {
		return radius;
	}
	public double getPerimter() {
		return perimter;
	}
	public double getArea() {
		return area;
	}
	@Override
	public String toString() {
		return "Circle [position=" + position + ", radius=" + radius + ", perimter=" + perimter + ", area=" + area
				+ "]";
	}
}
