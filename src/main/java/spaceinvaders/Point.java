package spaceinvaders;

/**
 * 
 * @author vsoltan
 * @version 1
 * 
 */
public class Point {

	private final double x, y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this(x * 1.0, y * 1.0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean equals(Point other) {
		return getX() == other.getX() && getY() == other.getY();
	}

	@Override
	public String toString() {
		return "Point(x=" + getX() + ",y=" + getY() + ")";
	}
}
