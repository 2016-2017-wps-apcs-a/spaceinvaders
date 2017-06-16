package src.main.java.spaceinvaders;

import java.awt.*;

/**
 * @author Deniz Guler
 * @author vsoltan
 * @author Chris Callahan
 */
public class HitBox extends Rectangle {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Point[] corners = new Point[4]; // from top left to bottom right
	private Point leftTop = new Point();
	private int xSize; // horizontal distance measured from the top left
	private int ySize; // vertical distance

	public HitBox(Point leftTop, int x, int y) {
		this.xSize = x;
		this.ySize = y;
		this.leftTop = leftTop;
		corners[0] = new Point((int) (leftTop.getX()), (int) (leftTop.getY() - y)); // BottonLeft
		corners[1] = leftTop; // TopLeft
		corners[2] = new Point((int) (leftTop.getX() + x), (int) (leftTop.getY())); // TopRight
		corners[3] = new Point((int) (leftTop.getX() + x), (int) (leftTop.getY() - y)); // BottomRight
	}

	public Point getLeftTop() {
		return this.leftTop;
	}

	public int getXSize() {
		return this.xSize;
	}

	public int getYSize() {
		return this.ySize;
	}

	public int getArea() {
		return xSize * ySize;
	}

	public Point[] getCorners() {
		return this.corners;
	}

	public boolean isInBounds(HitBox other) {
		Rectangle r1 = intersection(other);
		if (r1.x * r1.y == .05 * other.getArea()) {
			return true;
		}
		return false;
	}

}
