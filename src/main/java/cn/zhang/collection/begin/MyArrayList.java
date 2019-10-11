package cn.zhang.collection.begin;

public class MyArrayList /*implements List*/ {
	
	private Object[] elementData;
	
	private int size;
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Object get(int index) {
		return elementData[index];
	}

	public void add(Object obj) {
		//Êý×éÀ©ÈÝ
		if(size>elementData.length) {
			Object newArray[] = new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
		elementData[size++] = obj;
	}
	
	public void remove(int index) {
		int numMoved = size - index - 1;
		if(numMoved > 0) System.arraycopy(elementData, index+1, elementData, index, numMoved);
		elementData[--size] = null;
	}
	
	public void remove(Object obj) {
		for(int i = 0;i<size;i++) {
			if(get(i).equals(obj))
				remove(i);
		}
	}
	
	public MyArrayList() {
		this(10);
	}
	public MyArrayList(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}
	
}
