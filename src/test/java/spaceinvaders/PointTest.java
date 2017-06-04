package spaceinvaders;

/**
 * 
 * @author vsoltan
 * @version 1
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	public final double PRECISION = 0.0001;

	@Test
	public void testPointDefaultCtor() {
		Point pt = new Point();
		assertEquals(0, pt.getX(), PRECISION);
	}

	@Test
	public void testPointCtor() {
		Point pt = new Point(100, 200);
		assertEquals(100, pt.getX(), PRECISION);
		assertEquals(200, pt.getY(), PRECISION);
	}

	@Test
	public void testGetX() {
		Point pt = new Point(100, 200);
		assertEquals(100, pt.getX(), PRECISION);

	}

	@Test
	public void testGetY() {
		Point pt = new Point(100, 200);
		assertEquals(200, pt.getY(), PRECISION);
	}

	@Test
	public void testEquality() {
		Point pt1 = new Point(300, 400);
		assertTrue(new Point(300, 400).equals(pt1));
	}

	@Test
	public void testToString() {
		Point pt = new Point(100, 200);
		assertEquals("Point(x=100.0,y=200.0)", pt.toString());
	}

}
