<<<<<<< HEAD
=======
/*
 * MoveTest.java
 */
>>>>>>> c2e625ffd9ca20c8dd6b91adfa19f327b0b37ee5
package spaceinvaders;

import javax.swing.JFrame;
/*
 * @author Chris Callahan
 */

public class MoveTest {
    public static void main(String [] args){
        JFrame f = new JFrame();
        Move s = new Move();
        f.add(s);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        f.setUndecorated(true);
        f.setVisible( true );
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}