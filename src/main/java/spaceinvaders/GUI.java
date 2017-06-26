package spaceinvaders;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    /**
     * RED_FLAG: where did this come from?!
     */
    private static final long serialVersionUID = 1L;
    private static Sprite aLaser, morePoints, alienOne;
    private static SpaceShip ship;
    private static JFrame frame;

    private Time time = new Time();

    public GUI() {
        frame = new JFrame("Space Invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);
        frame.add(this);

        Container c = frame.getContentPane();
        c.setPreferredSize(new Dimension(500, 600));
        c.add(this);
        System.out.println(c.getPreferredSize());

        // RED_FLAG: test code for Sprite...
        ship = new SpaceShip();
        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
        ship.setLocation(new Point(250, 500));
        ship.setSize(50, 50);
        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
        frame.add(ship);
        frame.pack();
        System.out.println("HELLO: this is the ship's hitbox" + ship.getHitbox());

        morePoints = new MorePoints();
        System.out.println(morePoints.getPreferredSize() + " " + morePoints.getSize());
        morePoints.setLocation(new Point(200, 200));        
        System.out.println(morePoints.getPreferredSize() + " " + morePoints.getSize());
        frame.add(morePoints);
        frame.pack();

        aLaser = new AlienLaser();
        System.out.println(aLaser.getPreferredSize() + " " + aLaser.getSize());
        aLaser.setLocation(new Point(100, 100));        
        System.out.println(aLaser.getPreferredSize() + " " + aLaser.getSize());
        frame.add(aLaser);

        alienOne = new Alien3();
        System.out.println(alienOne.getPreferredSize() + " " + alienOne.getSize());
        alienOne.setLocation(new Point(200, 100));
        System.out.println(alienOne.getPreferredSize() + " " + alienOne.getSize());
        frame.add(alienOne);

        frame.pack();
        frame.setVisible(true);
        System.out.println(alienOne.getHitbox());

    }

    //method for testing movement
    public static void move() {
        aLaser.moveDown(2);
        frame.repaint();
    }

    public static void add(Sprite sprite) {
        frame.add(sprite);
        frame.pack();
        frame.repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return ((JFrame) SwingUtilities.getWindowAncestor(this)).getPreferredSize();
    }
}