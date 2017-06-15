package spaceinvaders;

import javax.swing.SwingUtilities;

public class GameLogic {

    /**
     * Resets the game.
     */
    public static void newGame() {
        System.out.println("# SpaceInvaders");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui = new GUI();
            }
        });
    }

    /**
     * Pauses the game.
     */
    public static void togglePause() {
        // STUB
    }

}