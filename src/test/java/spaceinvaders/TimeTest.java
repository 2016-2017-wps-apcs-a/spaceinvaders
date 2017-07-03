/*
 * TimeTest.java
 */
package spaceinvaders;

/**
 * Unit test for {@link Time}.
 *
 * @author 2016-2017 APCS A-Block
 * @author Chris Callahan
 * @author Deniz Guler
 * @author Valeriy Soltan
 */
public class TimeTest {
    //@Test
    public static void testCurrentTick() {
        Time test = new Time();
        long lastTick = 0;
        //long start = test.getCurrentTick();
        //while(test.getCurrentTick() == 0L)
        //    ;
        System.out.println("start");
        while(true)
            while(test.getCurrentTick() != lastTick) {
                lastTick = test.getCurrentTick();
                System.out.print(test.getCurrentTick() + ", ");
            }
        //System.out.print(test.getCurrentTick() + ", ");
    }

    public static void main(String[] args) {
        testCurrentTick();
    }

}