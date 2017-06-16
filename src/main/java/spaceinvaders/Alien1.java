package spaceinvaders;

import java.awt.Color;
import java.awt.Container;//Jason Provanzano
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Alien1 extends JPanel
{
  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  
    int b = 0; 

    if (getWidth() < getHeight()) {
     b = getWidth() * 3/16;
     
    }
    else{
     b= getHeight() * 3/16;
    }
     
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() /2;
    g.setColor(new Color( 10, 100, 10));
    g.fillRect(740 , 75 , 25, 75);
    g.fillRect(835, 75 , 25 ,75);
    g.setColor(Color.GREEN);
    g.fillRect(750 , 30, 100, 100);
    g.setColor(Color.BLACK);
    g.fillRect(775, 80, 50, 20);
    g.fillRect(755, 60, 20, 20);
    g.fillRect(825, 60, 20, 20);
    g.setColor(Color.RED);
    g.fillRect(760, 65, 10, 10);
    g.fillRect(830, 65, 10, 10);
    
  }
  public static void main(String[] args)
  {
    
    JFrame window = new JFrame("Alien1");
    window.setBounds(0, 0, 1280, 800);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Alien1 panel = new Alien1();
    panel.setBackground(Color.BLACK);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}