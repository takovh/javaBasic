package cn.takovh.javaBasic.c_12_designPattern.factory.factorymethod;

public class BydFactory implements CarFactory {

	@Override
	public Car creatCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}
	
}
