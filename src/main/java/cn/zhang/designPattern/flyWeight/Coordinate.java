package cn.zhang.designPattern.flyWeight;

/**
 * 外部状态UnsharedConcreteFlyWeight
 * @author tako_
 *
 */
public class Coordinate {
	private int x, y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
