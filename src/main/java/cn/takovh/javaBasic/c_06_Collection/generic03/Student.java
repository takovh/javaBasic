package cn.takovh.javaBasic.c_06_Collection.generic03;

public class Student<T> {
	private T score;

	public T getScore() {
		return score;
	}

	public void setScore(T score) {
		this.score = score;
	}
	
}
