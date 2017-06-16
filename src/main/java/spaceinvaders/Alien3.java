package src.main.java.spaceinvaders;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

// @Noah Criss
public class Alien3 extends Sprite {

    public Alien3() {
        super(new Dimension(100, 100));
        add(new FilledPolygon(new Color(0, 255, 0), new int[] { 50, 20, 80, }, new int[] { 0, 40, 40, }));
        add (new FilledPolygon(new Color (40,60,20), new int[] {20,30,40}, new int[] {40,50,50}));
        add (new FilledPolygon(new Color (40,60,20), new int[] {80,70,60}, new int[] {40,50,50}));
        add(new FilledPolygon(new Color(255,0,0), new int[] { 30, 70, 70, 30 }, new int[] {35, 35, 40, 40 }));
        add (new FilledPolygon(new Color (255,255,255), new int[] {30,35,40}, new int[] {35,40,35}));
        add (new FilledPolygon(new Color (255,255,255), new int[] {60,65,70}, new int[] {35,40,35}));
        add (new FilledPolygon(new Color (255,255,255), new int[] {50,55,60}, new int[] {35,40,35}));
        add (new FilledPolygon(new Color (255,255,255), new int[] {40,45,50}, new int[] {35,40,35}));
        add (new FilledPolygon(new Color (255,255,255), new int[] {40,50,40}, new int[] {20,30,30}));
        add (new FilledPolygon(new Color (255,255,255), new int[] {40,50,50}, new int[] {20,20,30}));
        add (new FilledPolygon(new Color (255,255,255), new int[] {50,60,50}, new int[] {20,30,30}));
        add (new FilledPolygon(new Color (255,255,255), new int[] {50,60,60}, new int[] {20,20,30}));
        add (new FilledPolygon(new Color (0,0,0), new int[] {50,50,}, new int[] {20,30}));
        //add (new FilledPolygon(new Color (0,0,0), new int[] {43,47,47,43}, new int[] {20,20,30,30}));
        //add (new FilledPolygon(new Color (0,0,0), new int[] {53,57,57,53}, new int[] {20,20,30,30}));
        add (new FilledPolygon(new Color (0,0,255), new int[] {43,47,47,43}, new int[] {23,23,27,27}));
        add (new FilledPolygon(new Color (0,0,255), new int[] {53,57,57,53}, new int[] {23,23,27,27}));
        
        
        
        
        
        
        
        
//add (new FilledPolygon(new Color.WHITE, new int[] {80,70,60}, new int[] {40,50,50}));
        /*
         * blocks.add(new Block(Color.BLACK, 0, 0, 4080, 1420)); // draws
         * rectangles of space ship blocks.add(new Block(Color.RED, 685, 720,
         * 100, 60)); blocks.add(new Block(Color.GRAY, 685, 695, 20, 50));
         * blocks.add(new Block(Color.GRAY, 765, 695, 20, 50)); blocks.add(new
         * Block(Color.RED, 720, 685, 30, 70)); blocks.add(new Block(new Color(
         * 60,10,10), 690, 725, 90, 70)); blocks.add(new Blockddd(Color.BLACK, 695,
         * 730, 80, 60)); blocks.add(new Block(Color.RED, 700, 735, 70, 50));
         * blocks.add(new Block(Color.BLACK, 705, 740, 60, 40)); blocks.add(new
         * Block(Color.BLACK, 690, 685, 10, 50)); blocks.add(new
         * Block(Color.BLACK, 770, 685, 10, 50)); blocks.add(new Block(new
         * Color( 60,10,10), 710, 745, 20, 30)); blocks.add(new Block(new Color(
         * 60,10,10), 740, 745, 20, 30)); blocks.add(new Block(new Color(
         * 60,10,10), 730, 685, 10, 40));
         */
    }

    private void paintBlock(Graphics g, Block block) {
        g.setColor(block.getColor());
        g.fillRect(block.getX(), block.getY(), block.getWidth(), block.getHeight());
    }

    /**
     * Moves the ship left.
     */
    public void moveLeft() {
        // STUB
    }

    /**
     * Moves the ship right.
     */
    public void moveRight() {
        // STUB
    }
    
    public static void main(String[] args)
  {
    
    JFrame window = new JFrame("Alien1");
    window.setBounds(0, 0, 1280, 800);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Alien3 panel = new Alien3();
    panel.setBackground(Color.BLACK);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

