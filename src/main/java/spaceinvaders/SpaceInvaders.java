/*
 * SpaceInvaders.java
 */
package spaceinvaders;

import javax.swing.*;

/**
 * SpaceInvaders is the main class for the SpaceInvaders game.
 *
 * @author David C. Petty
 */
public class SpaceInvaders {
    /**
     * The SpaceInvaders main method that initializes the entire game.
     *
     * @param args
     *            command-line argument array
     */
    public static void main(String[] args) {
        System.out.println("# SpaceInvaders");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI();
            }
        });
    }

    /**
     * Resets the game.
     */
    public static void newGame() {
        // STUB
    }

    /**
     * Pauses the game.
     */
    public static void togglePause() {
        // STUB
    }
}