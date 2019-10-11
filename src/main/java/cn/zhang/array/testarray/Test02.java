package cn.zhang.array.testarray;

public class Test02 {
	public static void main(String[] args) {
		//声明
		int[] a;
		int b[];
		
		//创建数组对象
		a = new int[2];
		b = new int[3];
		
		//对数组元素的初始化
		//默认初始化：数组元素相当于对象的成员变量，默认值跟成员变量的规则一样。
		//数字：0       布尔：false  char：\u0000    引用：null
		//动态初始化:
		a[0] = 23;
		a[1] = 45;
		for(int i = 0;i<a.length;i++) {
			a[i] = i*2;
		}
		for(int i = 0;i<b.length;i++) {
			b[i] = i*2;
		}
		//静态初始化：
		int c[] = {1,2,3};
		Car cars[] = {new Car("BMW"),new Car("VW"),new Car("BYD")};
		for(int i = 0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		for(int i = 0;i<cars.length;i++) {
			System.out.println(cars[i].name);
		}
	}
}
