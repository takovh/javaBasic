package cn.takovh.javaBasic.c_12_designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	Star realStar;
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		System.out.println("真正的方法执行前！");
		System.out.println("面谈、签合同、订票");
		if(method.getName().equals("sing")) {
			obj = method.invoke(realStar, args);
		}
		System.out.println("真正的方法执行后！");
		System.out.println("收钱");
		return obj;
	}

}
