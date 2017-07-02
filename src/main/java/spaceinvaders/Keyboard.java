/**
 * Keyboard.java
 *
 * @author Tyler Clift, Ricardo Gayle Jr., Benny Liang, Tom Diamond
 */
package spaceinvaders;

import java.awt.event.*;

public class Keyboard implements KeyListener {
    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Handle the key pressed event from the text field. Calls the move methods
     * from SpaceShip.
     */
    public void keyPressed(KeyEvent e) {
        int id = e.getKeyCode();
        switch (id) {
        case KeyEvent.VK_LEFT:
            Game.getShip().moveLeft();
            break;
        case KeyEvent.VK_RIGHT:
            Game.getShip().moveRight();
            break;
        case KeyEvent.VK_SPACE:
            Game.getShip().shoot();
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
     * newGame methods from SpaceInvaders.
     */
    public void keyTyped(KeyEvent e) {
        int id = e.getKeyChar();
        switch (id) {
        case KeyEvent.VK_P:
        case 'p':
             Game.togglePause();
            break;
        case KeyEvent.VK_R:
        case 'r':
             Game.newGame();
            break;
        default:
            break;
        }
    }
}