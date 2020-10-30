package cn.takovh.javaBasic.c_06_Collection.map;

/**
 * javabean 存储数据po bo vo 包含setter与getter访问器的类
 * @author tako_
 *
 */
public class Letter {
	private String name;//单词
	private int count;//
	
	public Letter() {
		// TODO Auto-generated constructor stub
	}

	//构造器
	//alt+shift+s -->o
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public Letter(String name) {
		super();
		this.name = name;
		this.count = 0;
	}
	//setter与getter
	//alt+shift+s -->r -->Tab -->enter -->Shift+Tab -->enter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
