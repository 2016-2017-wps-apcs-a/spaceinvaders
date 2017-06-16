
/*
 * MoveTest.java
 */

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