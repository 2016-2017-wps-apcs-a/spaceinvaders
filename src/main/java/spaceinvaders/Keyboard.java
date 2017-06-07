/*
 * Keyboard.java
 *
 * @author Tyler Clift
 * @author Ricardo Gayle II
 */
package spaceinvaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Keyboard implements KeyListener {

    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Handle the key pressed event from the text field. Calls the direction
     * methods from SpaceInvaders.
     */
    public void keyPressed(KeyEvent e) {
        int id = e.getKeyCode();
        switch (id) {
        case KeyEvent.VK_LEFT:
            SpaceInvaders.someMethod().turnLeft();
            break;
        case KeyEvent.VK_RIGHT:
            SpaceInvaders.someMethod().turnRight();
            break;
        default:
            break;
        }
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
    }

    /**
     * Handle the key typed event from the text field. Calls togglePause and
     * newGame methods from Game.
     */
    public void keyTyped(KeyEvent e) {
        int id = e.getKeyChar();
        switch (id) {
        case KeyEvent.VK_SPACE:
            SpaceInvaders.togglePause();
            break;
        case KeyEvent.VK_R:
        case 'r':
            SpaceInvaders.newGame();
            break;
        default:
            break;
        }
    }
}