import javax.swing.JFrame;
/*
 * @author Chris Callahan
 * */

public class MoveTest {
    public static void main(String [] args){
        
        JFrame f = new JFrame();
        Move s = new Move();
        f.add(s);
        f.setVisible( true );
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1280,800);
    }
}