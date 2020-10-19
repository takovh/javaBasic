package cn.zhang.cArray.myCollection;
/**
 * 模拟实现JDK中提供的ArrayList类
 * @author 张煜
 *
 */
public class MyArrayList {
	/**
	 * the value is used for object storage.
	 */
	private Object[] value;
	
	/**
	 * this size is the number of objects used.
	 */
	private int size;

	public MyArrayList(int size) {
		value = new Object[size];
	}
	public MyArrayList() {
//		value = new Object[16];
		this(2);
	}
	
	public void add(Object obj) {
		value[size] = obj;
		size++;
		if(size>=value.length) {
			int newCapacity = value.length*2;
			Object[] newList = new Object[newCapacity];
//			System.arraycopy(src, srcPos, dest, destPos, length);
			for(int i = 0;i<value.length;i++) {
				newList[i] = value[i];
			}
			value = newList;
		}
	}
	public Object get(int index) {
		if(index<0||index>size-1) {
			try {
				throw new Exception();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return value[index];
	}
	public int size() {
		return size;
	}
}

