package spaceinvaders;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GUI extends JPanel {
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