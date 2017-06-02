/*
 * SpaceInvadersTest.java
 */
package spaceinvaders;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 *
 * @author David C. Petty
 */
public class SpaceInvadersTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SpaceInvadersTest(String testName) {
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
    public void testSpaceInvaders() {
        assertTrue(true);
    }
}
