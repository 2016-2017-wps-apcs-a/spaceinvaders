/*
 * SpaceInvadersTest.java
 */
 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 *
 * @author David C. Petty
 */
public class SoundTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SoundTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SoundTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testSpaceInvaders() {
        assertTrue(true);
    }
}
