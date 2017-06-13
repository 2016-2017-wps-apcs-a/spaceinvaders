package spaceinvaders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/*
 * @author Chris Callahan
 */
public class Move extends JPanel implements ActionListener, KeyListener {
    private Timer t = new Timer(5, this);
    private static double x = 600, y = 700, velx = 0, vely = 0;
    private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static int h = (int) (screenSize.getHeight());
    private static int w = (int) (screenSize.getWidth());

    public Move() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, w / 20, w / 20));
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
        x += velx;
        y += vely;
    }

    public static void down() {
        vely = 2;

    }

    public static void up() {
        vely = -2;

    }

    public static void right() {
        velx = 2;

    }

    public static void left() {
        velx = -2;

    }

    public static void shoot() {

    }

    public void stop() {
        velx = 0;
        vely = 0;
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
        case KeyEvent.VK_UP:
            up();
            break;
        case KeyEvent.VK_DOWN:
            down();
            break;
        case KeyEvent.VK_RIGHT:
            right();
            break;
        case KeyEvent.VK_LEFT:
            left();
            break;
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        stop();
    }

}