package cn.zhang.lDesignPattern.factory.factorymethod;

public class AudiFactory implements CarFactory {

	@Override
	public Car creatCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}
	
}
