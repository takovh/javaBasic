package cn.zhang.collection.generic02;

/**
 * 	泛型接口与泛型类同理
 * @author tako_
 *
 */
public interface Comparator<T> {
	//全局常量
	public static final int MAX_VALUE = 1024;
	//公共抽象方法
	public abstract void test(T t);
}

//实现
@SuppressWarnings("rawtypes")
class InterfC1<A> implements Comparator{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
		
}
class InterfC2<A> implements Comparator<Integer>{

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}
	
}
class InterfC3<T, A> implements Comparator<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
	
}