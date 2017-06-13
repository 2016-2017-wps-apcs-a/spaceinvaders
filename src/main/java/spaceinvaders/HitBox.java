package spaceinvaders;

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
	private Point center = new Point();
	private int xSize; // .5 of horizontal distance measured from center
	private int ySize; // .5 vertical distance

	public HitBox(Point center, int x, int y) {
		this.xSize = x;
		this.ySize = y;
		this.center = center;
		corners[0] = new Point((int) (center.getX() - x), (int) (center.getY() - y)); // Botton
																						// Left
		corners[1] = new Point((int) (center.getX() - x), (int) (center.getY() + y)); // Top
																						// Left
		corners[2] = new Point((int) (center.getX() + x), (int) (center.getY() + y)); // Top
																						// Right
		corners[3] = new Point((int) (center.getX() + x), (int) (center.getY() - y)); // Bottom
																						// Right
	}

	public Point getCenter() {
		return this.center;
	}

	public int getXSize() {
		return this.xSize;
	}

	public int getYSize() {
		return this.ySize;
	}

	public int getArea() {
		return 4 * xSize * ySize;
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
