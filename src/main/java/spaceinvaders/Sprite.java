/*
 * Sprite.java
 */
package spaceinvaders;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Sprite is a JComponent base class for all on-screen items.
 *
 * @author David C. Petty
 */
public class Sprite extends JComponent {

	/** The list of <code>FilledPolygons</code> that define the sprite. */
	private java.util.List<FilledPolygon> polys = new ArrayList<FilledPolygon>();

	public Sprite() {
		polys.add(new FilledPolygon(Color.RED, new int[] { 685, 784, 784, 685, }, new int[] { 720, 720, 779, 779, }));
		polys.add(new FilledPolygon(Color.GRAY, new int[] { 685, 704, 704, 685, }, new int[] { 695, 695, 744, 744, }));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (FilledPolygon poly : polys) {
			poly.draw(g);
		}
	}
}