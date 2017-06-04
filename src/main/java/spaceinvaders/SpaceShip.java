package spaceinvaders;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

// @Jacob Naroian
public class SpaceShip extends JComponent {
  private java.util.List<Block> blocks = new ArrayList<Block>();
  
  public SpaceShip() {
    blocks.add(new Block(Color.RED, 685, 720, 100, 60));
    blocks.add(new Block(Color.GRAY, 685, 695, 20, 50));
  }

  private void paintBlock(Graphics g, Block block) {
    g.setColor(block.getColor());
    g.fillRect(block.getX(), block.getY(), block.getWidth(), block.getHeight());
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.BLACK);
    for (Block block : blocks) { paintBlock(g, block); }
    { 
//    g.setColor(Color.RED); // draws rectangles of space ship
//    g.fillRect(685, 720, 100, 60);
    
//    g.setColor(Color.GRAY);
//    g.fillRect(685, 695, 20, 50);
    
    g.setColor(Color.GRAY);
    g.fillRect(765, 695, 20, 50);
    
     g.setColor(Color.RED);
    g.fillRect(720, 685, 30, 70);
    
    g.setColor(new Color( 60,10,10));
    g.fillRect(690, 725, 90, 70);
    
    g.setColor(Color.BLACK);
    g.fillRect(695, 730, 80, 60);
    
    g.setColor(Color.RED);
    g.fillRect(700, 735, 70, 50);
    
    g.setColor(Color.BLACK);
    g.fillRect(705, 740, 60, 40);
  
    g.setColor(new Color(60,10,10));
    g.fillRect(690, 685, 10, 60);
    
    g.setColor(new Color(60,10,10));
    g.fillRect(770, 685, 10, 60);
    
    g.setColor(new Color( 60,10,10));
    g.fillRect(710, 745, 20, 30);
  
    g.setColor(new Color( 60,10,10));
    g.fillRect(740, 745, 20, 30);
    
    g.setColor(Color.BLACK);
    g.fillRect(730, 655, 10, 70);
    }
  }
}


