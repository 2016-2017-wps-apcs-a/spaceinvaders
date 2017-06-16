package src.main.java.spaceinvaders;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

/*
 * @author Chris Callahan
 * 
 * */

/**
	 * 
	 */
import javax.swing.JPanel;
import javax.swing.Timer;

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

	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		stop();
	}

}