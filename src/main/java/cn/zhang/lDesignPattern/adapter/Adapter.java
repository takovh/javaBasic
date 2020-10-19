package cn.zhang.lDesignPattern.adapter;

/**
 * 适配器（类适配器方式）
 * 相当于例子中的适配器本身（USB和PS/2转接器）
 * @author tako_
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void handleReq() {
		super.request();
	}
	
}
