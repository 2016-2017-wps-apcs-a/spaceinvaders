/*
 * TimeTest.java
 */
package spaceinvaders;


//import org.junit.Test;

public class TimeTest {
    //@Test
    public static void testCurrentTick() {
        Time test = new Time();
        //long start = test.getCurrentTick();
        //while(test.getCurrentTick() == 0L)
        //    ;
        //System.out.print("start");
        while(true)
                System.out.print(test.getCurrentTick() + ", ");
        //System.out.print(test.getCurrentTick() + ", ");
    }

    public static void main(String[] args) {
        testCurrentTick();
    }

}