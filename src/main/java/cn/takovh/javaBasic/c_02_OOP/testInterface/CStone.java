package cn.takovh.javaBasic.c_02_OOP.testInterface;

public class CStone implements IFlyable,IAttack {
	@Override
	public void fly() {
		System.out.println("被人扔飞");
	}

	@Override
	public void attack() {
		System.out.println("石头攻击");
	}
}
