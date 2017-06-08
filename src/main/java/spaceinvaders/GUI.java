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
        c.setPreferredSize(new Dimension(800, 600));
        window.setLocation(100, 100);
        c.add(this);

        Sprite ship = new SpaceShip();
        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
        ship.setLocation(new Point(100, 100));
        ship.setSize(50, 50);
        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
        c.add(ship);

        window.pack();
        window.setVisible(true);
    }
}