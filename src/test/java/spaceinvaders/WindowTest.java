/*
 * WindowTest.java
 */
package spaceinvaders;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for {@link Window}.
 *
 * @author 2016-2017 APCS A-Block
 */
public class WindowTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WindowTest(String testName) {
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
    public void testGUI() {
        assertTrue(true);
    }
}
