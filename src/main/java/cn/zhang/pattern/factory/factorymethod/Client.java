package cn.zhang.pattern.factory.factorymethod;

public class Client {
	public static void main(String[] args) {
		CarFactory f1 = new AudiFactory();
		CarFactory f2 = new BydFactory();
		Car c1 = f1.creatCar();
		Car c2 = f2.creatCar();
		
		c1.run();
		c2.run();
	}
}
