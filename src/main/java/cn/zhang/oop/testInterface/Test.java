package cn.zhang.oop.testInterface;

public class Test {
	public static void main(String[] args) {
		CMan man = new CMan();
		man.fly();
		CPlane plane = new CPlane();
		plane.fly();
		CStone stone = new CStone();
		stone.attack();
		stone.fly();
		
		IAttack attack = stone;
		attack.attack();
	}
}
