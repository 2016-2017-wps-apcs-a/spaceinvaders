package spaceinvaders;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		JFrame window = new JFrame("Space Invaders"); // makes JFrame
		window.setBounds(300, 300, 200, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI panel = new GUI();
		panel.setBackground(Color.BLACK);
		Container c = window.getContentPane();
		c.add(panel);
		c.add(new SpaceShip());
		window.setVisible(true);
	}
}