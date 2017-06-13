package spaceinvaders;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    /**
     * RED_FLAG: where did this come from?!
     */
    private static final long serialVersionUID = 1L;

    public GUI() {
        JFrame frame = new JFrame("Space Invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);

        Container c = frame.getContentPane();
        c.setPreferredSize(new Dimension(800, 600));
        c.add(this);
        System.out.println(c.getPreferredSize());

        // RED_FLAG: test code for Sprite...
        Sprite ship = new SpaceShip();
        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
        ship.setLocation(new Point(100, 100));
        ship.setSize(50, 50);
        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
        c.add(ship);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public Dimension getPreferredSize() {
        return ((JFrame) SwingUtilities.getWindowAncestor(this)).getPreferredSize();
    }
}