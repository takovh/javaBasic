package cn.zhang.bOOP.testInterface;

public interface MyInterface {
	//接口中只有常量和抽象方法
	String MAX_GRADE = "BOSS";//默认是 pubic static final
	int MAX_SPEED = 120;
	public void test01();//默认是public abstract
	public int test02(int a,int b);
}
