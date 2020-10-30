package cn.takovh.javaBasic.c_12_designPattern.adapter;

/**
 * 被适配的类，相当于例子中的PS/2键盘
 * @author tako_
 *
 */
public class Adaptee {
	public void request() {
		System.out.println("可以完成客户请求的功能！");
	}
}
