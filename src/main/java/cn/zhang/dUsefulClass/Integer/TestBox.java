package cn.zhang.dUsefulClass.Integer;
/**
 * 测试自动拆箱和装箱
 * @author 张煜
 *
 */
public class TestBox {
	public static void main(String[] args) {
		Integer [] i = new Integer[2];
		i[0] = new Integer(100);//过时了,但是不影响使用
		i[1] = 100;//jdk5.0之后，编译器进行判断 —— 自动装箱：编译器帮我们修改代码为i[1] = new Integer(100);
		for(Integer e : i) System.out.println(e);
		
		int m = i[0].intValue();
		int n = i[0];//jdk5.0之后，编译器进行判断 —— 自动拆箱：编译器帮我们修改代码为int n = i[0].intValue();
		System.out.println(m);
		System.out.println(n);
		
		System.out.println(i[0] == i[1]);//再次认识引用，内存分析
		System.out.println(i[0].equals(i[1]));
		
		Integer d1 = 128;//[-128,127]之间的数，仍然当作基本数据类型来处理
		Integer d2 = 128;
		Integer d3 = new Integer(100);//new出来的地址一定不等
		Integer d4 = new Integer(100);
		System.out.println(d1 == d2);
		System.out.println(d3 == d4);
	}
}
