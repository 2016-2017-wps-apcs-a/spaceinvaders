package src.main.java.spaceinvaders;

import java.awt.Color;
import java.awt.Container;//Jason Provanzano
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Alien2 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int b = 0;
		if (getWidth() < getHeight()) {
			b = getWidth() * 3 / 16;

		} else {
			b = getHeight() * 3 / 16;
		}

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		g.setColor(new Color(189, 177, 2));
		g.fillRect(740, 75, 25, 75);// Sets the arms and the color of the arms
									// for the aliens
		g.fillRect(835, 75, 25, 75);
		g.setColor(Color.ORANGE);
		g.fillRect(750, 30, 100, 100);// Sets the body and color of the body
		g.setColor(Color.BLACK);
		g.fillRect(775, 80, 50, 20);
		g.fillRect(755, 60, 20, 20);// Sets the mouth and eyes
		g.fillRect(825, 60, 20, 20);
		g.setColor(Color.RED);
		g.fillRect(760, 65, 10, 10);
		g.fillRect(830, 65, 10, 10);// Makes eyes red
		int[] xPoints = { 785, 795, 790 };
		int[] yPoints = { 100, 100, 80 };

		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints, yPoints, 3);
		g.setColor(Color.WHITE);
		g.fillPolygon(xPoints, yPoints, 3);

		int[] nPoints = { 790, 800, 795 };
		int[] mPoints = { 80, 80, 100 };

		g.setColor(Color.BLACK);
		g.drawPolygon(nPoints, mPoints, 3);
		g.setColor(Color.WHITE);
		g.fillPolygon(nPoints, mPoints, 3);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Alien2");
		window.setBounds(300, 300, 200, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Alien2 panel = new Alien2();
		panel.setBackground(Color.BLACK);
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true);

	}
}