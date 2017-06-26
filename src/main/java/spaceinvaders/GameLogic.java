package spaceinvaders;

import java.util.*;

/**
 * Main Game Logic Class
 *
 * @author Deniz Guler
 */
public class GameLogic {
    private static ArrayList<SpaceShip> ship;  //ship object
    private static ArrayList<ArrayList<Sprite>> aliens = new ArrayList<>();  //aliens
    private static GUI gui;
    /**
     * Resets the game.
     */
    public static void newGame() {
        // STUB
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

    /**
     * Pauses the game.
     */
    public static void togglePause() {
        // STUB
    }
    
}