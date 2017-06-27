package spaceinvaders;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI extends JPanel {
    /**
     * RED_FLAG: where did this come from?!
     */
    private static final long serialVersionUID = 1L;
    private static Sprite aLaser, morePoints, alienOne;
    private static SpaceShip ship;
    private JFrame frame;
    //private JPanel panel;
    private int Width, Height;

    private Time time = new Time();

    public GUI() {


        frame = new JFrame("Space Invaders Game");
        // = new JPanel();
        this.setBounds(0,0,500,600);
        this.setBackground(Color.BLACK);

        frame.add(this);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);

        Width = frame.getWidth();
        Height = frame.getHeight();
    }
//        frame = new JFrame("Space Invaders");
//        JPanel panel = new JPanel();
//
//        panel.setBackground(Color.BLACK);
//        panel.setBounds(0,0, 500,600);
//        frame.add(panel);
//        frame.setSize(new Dimension(500,600));
//        frame.setLayout(null);
//        frame.setVisible(true);

//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocation(100, 100);
//
//        frame.add(this);
//
//        Container c = frame.getContentPane();
//        c.setPreferredSize(new Dimension(500, 600));
//        c.add(this);
//        System.out.println(c.getPreferredSize());
//
//        Width = c.getWidth();
//        Height = c.getHeight();
//
//        // RED_FLAG: test code for Sprite...
//        ship = new SpaceShip();
//        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
//        ship.setLocation(new Point(250, 500));
//        ship.setSize(50, 50);
//        System.out.println(ship.getPreferredSize() + " " + ship.getSize());
//        frame.add(ship);
//        frame.pack();
//        System.out.println("HELLO: this is the ship's hitbox" + ship.getHitbox());
//
//        morePoints = new MorePoints();
//        System.out.println(morePoints.getPreferredSize() + " " + morePoints.getSize());
//        morePoints.setLocation(new Point(200, 200));
//        System.out.println(morePoints.getPreferredSize() + " " + morePoints.getSize());
//        frame.add(morePoints);
//        frame.pack();
//
//        aLaser = new AlienLaser();
//        System.out.println(aLaser.getPreferredSize() + " " + aLaser.getSize());
//        aLaser.setLocation(new Point(100, 100));
//        System.out.println(aLaser.getPreferredSize() + " " + aLaser.getSize());
//        frame.add(aLaser);
//        frame.pack();
//
//        alienOne = new Alien3(new Dimension(100, 100));
//        System.out.println(alienOne.getPreferredSize() + " " + alienOne.getSize());
//        alienOne.setLocation(new Point(200, 100));
//        System.out.println(alienOne.getPreferredSize() + " " + alienOne.getSize());
//        frame.add(alienOne);

    //method for testing movement
    //public void move() {
    //    aLaser.moveDown(2);
    //    frame.repaint();
    //}

    public void paintComponenet(Graphics g) {
        super.paintComponent(g);

        for (ArrayList<Sprite> sprites : GameLogic.getAliens()){
            for (Sprite sprite : sprites){
                sprite.paintComponent(g);
            }
        }
    }

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    @Override
    public Dimension getPreferredSize() {
        return ((JFrame) SwingUtilities.getWindowAncestor(this)).getPreferredSize();
    }
}