package cn.takovh.javaBasic.c_03_array.testarray;

public class Test01 {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 34;
		a[2] = 45;
		
		Car[] cars = new Car[2];
		cars[0] = new Car("BMW");
		cars[1] = new Car("BYD");
		
		for(int n=0;n<a.length;n++) {
			System.out.print("a["+n+"] = ");
			System.out.println(a[n]);
		}
		
		for(int n=0;n<cars.length;n++) {
			System.out.print("cars["+n+"] = ");
			System.out.println(cars[n].name);
		}
	}
}
