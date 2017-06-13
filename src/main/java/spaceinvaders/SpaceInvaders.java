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
    /** GUI for <code>SpaceInvaders</code> game. */
    private static GUI gui;

    /**
     * <code>SpaceInvaders</code> graphical user interface.
     *
     * @return graphical user interface for <code>SpaceInvaders</code> game.
     */
    public static GUI getGUI() {
        return gui;
    }

    /**
     * SpaceInvaders main method that initializes the entire game.
     *
     * @param args command-line argument array
     */
    public static void main(String[] args) {
        System.out.println("# SpaceInvaders");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui = new GUI();
            }
        });
    }
}