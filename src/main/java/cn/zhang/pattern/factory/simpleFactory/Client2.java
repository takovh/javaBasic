package cn.zhang.pattern.factory.simpleFactory;

/**
 * 简单工厂情况下
 * @author tako_
 *
 */
public class Client2 {
	public static void main(String[] args) {
		Car c1 = CarFactory.creatCar("奥迪");
		Car c2 = CarFactory.creatCar("比亚迪");
		
		c1.run();
		c2.run();
	}
}
