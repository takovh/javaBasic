package cn.takovh.javaBasic.c_12_designPattern.singleton;

/**
 * 枚举实现单例模式
 * 避免反射和反序列化的漏洞
 * 调用效率高
 * 无懒加载
 * @author tako_
 *
 */
public enum SingletonDemo4 {
	//这个枚举元素本身就是单例对象
	INSTANCE;
	public void singletonOperation() {
	}
}
