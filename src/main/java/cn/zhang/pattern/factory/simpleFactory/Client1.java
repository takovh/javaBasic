package cn.zhang.pattern.factory.simpleFactory;

/**
 * 测试在没有用工厂模式的情况下调用
 * @author tako_
 *
 */
public class Client1 {
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}
}
