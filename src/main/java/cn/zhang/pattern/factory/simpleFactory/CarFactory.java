package cn.zhang.pattern.factory.simpleFactory;

public class CarFactory {
	public static Car creatCar(String type) {
		if("°ÂµÏ".equals(type)) {
			return new Audi();
		}else if("±ÈÑÇµÏ".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
	}
}
