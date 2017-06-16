/*
 * HitBoxTest.java
 */
package spaceinvaders;

import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Deniz Guler
 */
public class HitBoxTest {

	@Test
	public void testHitBoxCtorOne() {
		HitBox h1 = new HitBox(new Point(0, 0), 1, 1);
		Point[] p1 = { new Point(0,-1), new Point(0,0), new Point(1, 0), new Point(1, -1) };
		Assert.assertArrayEquals(p1, h1.getCorners());
	}

	@Test
	public void testHitBoxCtorTwo() {
		HitBox h1 = new HitBox(new Point(10, 7), 5, 6);
		Point[] p1 = { new Point(10, 1), new Point(10, 7), new Point(15, 7), new Point(15, 1) };
		Assert.assertArrayEquals(p1, h1.getCorners());
	}

	@Test
	public void tesIntersect() {
		HitBox h1 = new HitBox(new Point(1, 1), 1, 1);
		HitBox h2 = new HitBox(new Point(5, 7), 2, 2);
		Assert.assertFalse(h1.isInBounds(h2));

	}

}
