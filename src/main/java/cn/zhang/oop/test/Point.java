package cn.zhang.oop.test;

public class Point {
	int x;
	int y;
	public Point(){ x=0;y=0;}
	public Point(int xx,int yy){
		x=xx;
		y=yy;
	}
	public int getx(){return x;}
	public int gety(){return y;}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
