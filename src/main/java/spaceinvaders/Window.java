/*
 * Window.java
 */
package spaceinvaders;

import javax.swing.*;
import java.awt.*;

/** DESCRIBE {@link Window} HERE.
 * 
 * @author 2016-2017 APCS A-Block
 */
public class Window extends JPanel {

    //////////////////////////////// FIELDS ////////////////////////////////

    /** Preferred size of this {@link Window}. */
    private Dimension preferredSize;
    /** Current size of this {@link Window}. */
    private Dimension size;

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    public Window() {
        size = preferredSize = new Dimension(1300, 820);
        setBackground(Color.BLACK);
    }

    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Paint the component using a {@link Graphics} rendering object.
     *
     * @param g the Graphics rendering object
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < Game.getAliens().size(); i ++){
            Game.getAliens().get(i).paintComponent(g);
        }
        for (int i = 0; i < Game.getShips().size(); i ++){
            Game.getShips().get(i).paintComponent(g);
        }
    }
    @Override
    public void setSize(int width, int height) {
        size.setSize(width, height);
    }

    @Override
    public void setSize(Dimension size) {
        // RED_FLAG: setSize(Dimension) calls setSize(int, int) else infinite
        // recursion
        setSize(size.width, size.height);
    }

    @Override
    public Dimension getSize() {
        return size;
    }

    @Override
    public Dimension getPreferredSize() {
        return preferredSize;
    }

/*
    @Override
    public Dimension getPreferredSize() {
        return ((JFrame) SwingUtilities.getWindowAncestor(this)).getPreferredSize();
    }
*/
}