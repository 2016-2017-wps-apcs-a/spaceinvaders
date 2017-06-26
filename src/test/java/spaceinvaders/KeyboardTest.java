/*
 * KeyboardTest.java
 */

package spaceinvaders;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.junit.*;

/**
 * Unit test for {@link Keyboard}.
 *
 * @author Tyler Clift
 * @author Tom Diamond
 * @author Ricardo Gayle Jr.
 * @author Benny Liang
 */
public class KeyboardTest implements KeyListener {
	public static void main(String[] args) {

	}

	public void keyPressed(KeyEvent e) {
		int id = e.getKeyCode();
		switch (id) {
			case KeyEvent.VK_LEFT:
				System.out.println("left");
			case KeyEvent.VK_RIGHT:
				System.out.println("right");
			case KeyEvent.VK_SPACE:
				System.out.println("shoot");
			case KeyEvent.VK_P:
			case 'p':
				System.out.println("pause");
			case KeyEvent.VK_R:
			case 'r':
				System.out.println("restart");
			default:
				System.out.println("left");
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent e) {
		int id = e.getKeyCode();
		switch (id) {
			case KeyEvent.VK_LEFT:
				System.out.println("left");
			case KeyEvent.VK_RIGHT:
				System.out.println("right");
			case KeyEvent.VK_SPACE:
				System.out.println("shoot");
			case KeyEvent.VK_P:
			case 'p':
				System.out.println("pause");
			case KeyEvent.VK_R:
			case 'r':
				System.out.println("restart");
			default:
				System.out.println("left");
		}
	}
}

