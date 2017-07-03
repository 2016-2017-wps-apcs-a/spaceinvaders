/*
 * SoundFXTest.java
 */
package spaceinvaders;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for {@link SoundFX}.
 *
 * @author 2016-2017 APCS A-Block
 */
public class SoundFXTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SoundFXTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SoundFXTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testSoundFX() {
        assertTrue(true);
    }
}
