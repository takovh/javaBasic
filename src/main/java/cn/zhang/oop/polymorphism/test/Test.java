package cn.zhang.oop.polymorphism.test;
/**
 * 测试多态
 * @author Lenovo
 *
 */
public class Test {
	public static void testAnimalVoice(Animal a) {
		a.voice();
		if(a instanceof Cat) ((Cat)a).catchMouse();//如果a是Cat的一个实例
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal d = new Dog();
		testAnimalVoice(c);//多态，要有继承，要有方法重写，父类引用指向子类对象
		testAnimalVoice(d);//多态，要有继承，要有方法重写，父类引用指向子类对象
		Dog d2 = (Dog)d;//强制转格式
		d2.lookDoor();//d是Animal,没有lookDoor的功能
		((Dog)d).lookDoor();//强制转格式
	}
}
