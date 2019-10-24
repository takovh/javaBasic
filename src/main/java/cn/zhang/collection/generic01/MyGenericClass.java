package cn.zhang.collection.generic01;

/**
 * 	自定义泛型类/接口/方法
 * @author tako_
 * 1. <>  单个大写字母，尽可能见名之意
 * 2.
 * T Type
 * K V Key Value
 * E Element
 * 3.注意：泛型不能使用在静态属性上
 * 4.注意：泛型不能使用在全局常量上
 * 5.使用时，在声明中指定具体类型，不能为基本类型
 * 6.非泛型类中也可定义泛型方法
 */
public class MyGenericClass<T> {
	private T javase;

	public MyGenericClass(T javase) {
		super();
		this.javase = javase;
	}

	public T getJavase() {
		return javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
	
}
