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
            GameLogic.getShip().moveLeft();
            break;
        case KeyEvent.VK_RIGHT:
            GameLogic.getShip().moveRight();
            break;
        case KeyEvent.VK_SPACE:
            GameLogic.getShip().shoot();
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
             GameLogic.togglePause();
            break;
        case KeyEvent.VK_R:
        case 'r':
             GameLogic.newGame();
            break;
        default:
            break;
        }
    }
}