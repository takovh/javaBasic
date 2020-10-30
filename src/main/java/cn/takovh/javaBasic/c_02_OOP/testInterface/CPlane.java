package cn.takovh.javaBasic.c_02_OOP.testInterface;

public class CPlane implements IFlyable{
	@Override
	public void fly() {
		System.out.println("飞机依靠发动机在飞");
	}
}
