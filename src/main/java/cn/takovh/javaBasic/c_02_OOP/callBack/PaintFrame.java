package cn.takovh.javaBasic.c_02_OOP.callBack;

/**
 * Java中可以使用接口来实现类似函数指针的功能，完成回调
 * 1、定义一个接口，在接口中声明要调用的方法
 * 2、在需要回调的地方使用这个接口
 * 3、将接口的实现传入
 */
public class PaintFrame {
	public static void drawFrame(IMyFrame f) {
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.paint();//传入的是接口，已经定义好方法
		
		System.out.println("启动缓存，增加效率");
	}
	
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
		System.out.println("**********");
		drawFrame(new GameFrame02());
	}
}

class GameFrame01 implements IMyFrame{
	public void paint() {
		System.out.println("GameFrame01.paint()");
		System.out.println("画窗口...");
	}
}
class GameFrame02 implements IMyFrame{
	public void paint() {
		System.out.println("GameFrame02.paint()");
		System.out.println("画窗口...");
	}
}