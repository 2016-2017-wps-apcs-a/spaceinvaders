/*
 * Keyboard.java
 *
 * @author Tyler Clift, Ricardo Gayle Jr., Benny Liang, Tom Diamond
 */
package src.main.java.spaceinvaders;

import java.awt.event.*;

public class Keyboard implements KeyListener {

	//////////////////////////////// METHODS ///////////////////////////////

	/**
	 * Handle the key pressed event from the text field. Calls the move methods
	 * from SpaceShip.
	 */
	Sprite object;

	public void keyPressed(KeyEvent e) {
		int id = e.getKeyCode();
		switch (id) {
		case KeyEvent.VK_LEFT:
			object.moveLeft(10);
			break;
		case KeyEvent.VK_RIGHT:
			object.moveRight(10);
			break;
		case KeyEvent.VK_SPACE:
			// STUB shoot
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
			// GameLogic.togglePause();
			break;
		case KeyEvent.VK_R:
		case 'r':
			// GameLogic.newGame();
			break;
		default:
			break;
		}
	}
}