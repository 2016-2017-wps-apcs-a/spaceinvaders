package spaceinvaders;
import spaceinvaders.*;

import java.awt.*;
import java.util.ArrayList;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Main Game Logic Class
 *
 * @author Deniz Guler, Valeriy Soltan
 */
public class GameLogic {

    private static GUI gui = new GUI();
    private static final double X_SPACING = 2.0 / 72.0 * getGui().getWidth();
    private static final double Y_SPACING = 1.0 / 36.0 * getGui().getHeight();
    private static ArrayList<SpaceShip> ship = new ArrayList<>(3);  //ship object
    private static ArrayList<ArrayList<Sprite>> aliens = new ArrayList<>(5);  //aliens
    private static Time timer = new Time();




    /**
     * Resets the game.
     */
    public static void newGame() {
        for (int r = 0; r < 1; r++) {
            aliens.add(new ArrayList<Sprite>());
            for (int c = 0; c < 3; c++) {
                int alienWidth = (int) (4.0 / 72.0 * getGui().getWidth());
                int alienHeight = (int) (4.0 / 36.0 * getGui().getHeight());
                Alien3 alien = new Alien3(new Dimension(alienWidth, alienHeight));
                alien.setLocation((int) X_SPACING + alienWidth * c, (int) Y_SPACING + alienHeight * r);
                aliens.get(r).add(alien);
                //getGui().add(aliens.get(r).get(c));
                System.out.println(gui.getWidth());
                System.out.println(alien);
            }

        }
        System.out.println(aliens);
        getGui().repaint();
    }

    /**
     * Returns the current SpaceShip
     *
     * @return the current Spaceship
     */
    public static SpaceShip getShip(){
        return ship.get(0);
    }

    public int getLives(){
        return ship.size();
    }

    public static GUI getGui(){
        return gui;
    }

    public static ArrayList<ArrayList<Sprite>> getAliens() {
        return aliens;
    }

    /**
     * Pauses the game.
     */
    public static void togglePause() {
        // STUB
    }

}