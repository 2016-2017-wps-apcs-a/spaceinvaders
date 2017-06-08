package spaceinvaders;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

// @Jacob Naroian 
public class SpaceShip extends Sprite {

    public SpaceShip() {
        super(new Dimension(100, 100));
        add(new FilledPolygon(new Color(60, 10, 10), new int[] { 0, 100, 200, }, new int[] { 110, 10, 110, }));
        /*
         * blocks.add(new Block(Color.BLACK, 0, 0, 4080, 1420)); // draws
         * rectangles of space ship blocks.add(new Block(Color.RED, 685, 720,
         * 100, 60)); blocks.add(new Block(Color.GRAY, 685, 695, 20, 50));
         * blocks.add(new Block(Color.GRAY, 765, 695, 20, 50)); blocks.add(new
         * Block(Color.RED, 720, 685, 30, 70)); blocks.add(new Block(new Color(
         * 60,10,10), 690, 725, 90, 70)); blocks.add(new Block(Color.BLACK, 695,
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
}
