package spaceinvaders;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public GUI() {
        JFrame window = new JFrame("Space Invaders");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        Container c = window.getContentPane();
        c.setPreferredSize(new Dimension(1200, 800));
        window.setLocation(100, 100);
        c.add(this);

        Sprite ship = new SpaceShip();
        ship.move(new Point(100, 100));
        c.add(ship);

        window.pack();
        window.setVisible(true);
    }
}