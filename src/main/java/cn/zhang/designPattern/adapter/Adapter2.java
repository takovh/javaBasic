package cn.zhang.designPattern.adapter;

/**
 * 适配器（对象适配器方式）
 * 相当于例子中的适配器本身（USB和PS/2转接器）
 * @author tako_
 *
 */
public class Adapter2 implements Target {
	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
}
