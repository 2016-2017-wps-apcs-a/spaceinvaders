/*
 * Sprite.java
 */
package spaceinvaders;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

/**
 * Sprite is a JComponent base class for all on-screen items.
 *
 * @author David C. Petty, Deniz Guler, Chris Callahan, Valeriy Soltan
 */
public class Sprite extends JComponent {
	/** Preferred size of this <code>Sprite</code>. */
	private Dimension preferredSize;
	/** Current size of this <code>Sprite</code>. */
	private Dimension size;
	/** The list of <code>FilledPolygons</code> that define the sprite. */
	private java.util.List<FilledPolygon> polys;
	private Rectangle hitbox;
	private final int SCALE = 5;

	public Sprite() {
		polys = new ArrayList<FilledPolygon>();
		size = preferredSize = new Dimension(100, 100); // default size
		// System.out.println(SwingUtilities.getRoot(SpaceInvaders.getGUI()));

		// creates hitbox frame

		// System.out.println(SpaceInvaders.getGUI().getPreferredSize());
	}

	public Sprite(Dimension size) {
		this();
		this.size = preferredSize = size;
		this.hitbox = new Rectangle(new Point(0, 0), size);
	}

	public void add(FilledPolygon poly) {
		polys.add(poly);
	}

	@Override
	public void setSize(int width, int height) {
		double xScale = width / size.getWidth();
		double yScale = height / size.getHeight();
		int x = getX(), y = getY();
		System.out.println(xScale + " " + yScale);
		for (FilledPolygon poly : polys) {
			assert poly.xpoints.length == poly.ypoints.length : "invalid polygon";
			for (int i = 0; i < poly.xpoints.length; i++) {
				poly.xpoints[i] = (int) Math.round((poly.xpoints[i] - x) * xScale) + x;
				poly.ypoints[i] = (int) Math.round((poly.ypoints[i] - y) * yScale) + y;
			}
		}
		size.setSize(width, height);
	}

	@Override
	public void setSize(Dimension size) {
		// RED_FLAG: setSize(Dimension) calls setSize(int, int) else infinite
		// recursion
		setSize(size.width, size.height);
	}

	@Override
	public Dimension getSize() {
		return size;
	}

	@Override
	public Dimension getPreferredSize() {
		return preferredSize;
	}

	@Override
	public void setLocation(Point p) {
		for (FilledPolygon poly : polys)
			poly.translate((int) (p.getX() - getX()), (int) (p.getY() - getY()));
		super.setLocation(p);
		Point locationHitBox = new Point((int) (p.x + 2 * size.getWidth() / SCALE), p.y);
		Dimension dimHitBox = new Dimension((int) size.getWidth() / SCALE, (int) size.getHeight());
		hitbox.setBounds(new Rectangle(dimHitBox));
		hitbox.setLocation((int) locationHitBox.getX(), (int) locationHitBox.getY());

	}

	public void translate(int dx, int dy) {
		for (FilledPolygon poly : polys)
			poly.translate(dx, dy);
		super.setLocation(new Point(getX() + dx, getY() + dy));
		hitbox.setLocation(new Point((int) (hitbox.getX() + dx), (int) (hitbox.getY() + dy)));
	}

	public void moveUp(int d) {
		translate(0, -d);
	}

	public void moveDown(int d) {
		translate(0, d);
	}

	public void moveLeft(int d) {
		translate(-d, 0);
	}

	public void moveRight(int d) {
		translate(d, 0);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (FilledPolygon poly : polys) {
			poly.draw(g);
		}
	}
}