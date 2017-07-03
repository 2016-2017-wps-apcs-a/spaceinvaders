/*
 * SpriteTest.java
 */
package spaceinvaders;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for {@link Sprite}.
 *
 * @author 2016-2017 APCS A-Block
 */
public class SpriteTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SpriteTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SpaceInvadersTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testSpaceShip() {
        assertTrue(true);
    }
}
