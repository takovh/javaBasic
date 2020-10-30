package cn.takovh.javaBasic.c_12_designPattern.factory.factorymethod;

public class AudiFactory implements CarFactory {

	@Override
	public Car creatCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}
	
}
