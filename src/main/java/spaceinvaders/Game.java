/*
 * Game.java
 */
package spaceinvaders;

import java.awt.*;
import java.util.*;
import org.apache.logging.log4j.*;

/**
 * {@link Game} class initializes {@link SpaceInvaders} game and holds 
 * universal static fields.
 *
 * @author 2016-2017 APCS A-Block
 * @author Deniz Guler
 * @author Valeriy Soltan
 */
public class Game {
    /**
     * The three states of {@link Game}: PAUSED, RUNNING, OVER.
     */
    private enum State { PAUSED, RUNNING, OVER, };

    //////////////////////////////// FIELDS ////////////////////////////////

    /** log4j {@link Logger}. */
    private static Logger logger = LogManager.getLogger(SpaceInvaders.SHORT);
      /** {@link SpaceInvaders} game {@link State}. */
    private static State state;
    /** {@link SpaceInvaders} game {@link Window}. */
    private static Window window;
    /** {@link SpaceInvaders} game {@link Time}. */
    private static Time timebase;

    private static java.util.List<Sprite> ships = new ArrayList<Sprite>();
    private static java.util.List<Sprite> aliens = new ArrayList<Sprite>();

    private static final int BOXES_ACROSS = 65;
    private static final int BOXES_DOWN = 41;
    private static final int ALIENS_ACROSS = 12;
    private static final int ALIENS_DOWN = 5;
    private static final int NUMBER_SHIPS = 3;

    //////////////////////////////// METHODS ///////////////////////////////

    public static void newGame(Window window) {
        Game.window = window;
        state = State.RUNNING;
        timebase = new Time();

        // Add aliens. There are ALIENS_ACROSS x ALIENS_DOWN aliens.
        // Each has a border of 1 side and is a 4-side x 4-side square.
        // The alien origin is ( 1-side, 6-side ).
        int side = getSide();   // assume aliens are square
        int originX = 1 * side, originY = 6 * side;
        for (int i = 0; i < ALIENS_ACROSS * ALIENS_DOWN; i++) {
            Sprite alien = new Alien();
            alien.setSize(side * 4, side * 4);
            int x = i % ALIENS_ACROSS * side * 5 + originX;
            int y = i / ALIENS_ACROSS * side * 5 + originY;
            alien.setLocation(new Point(x, y));
            aliens.add(alien);
            logger.debug(alien);
        }
        // Add spaceships. There are NUMBER_SHIPS spaceships.
        // Each is a 4-side x 4-side square.
        // The spaceship origin is ( 46-side, 36-side ).
        originX = 46 * side; originY = 36 * side;
        for (int i = 0; i < NUMBER_SHIPS; i++) {
            Sprite ship = new SpaceShip();
            ship.setSize(side * 4, side * 4);
            int x = i * side * 5 + originX, y = originY;
            ship.setLocation(new Point(x, y));
            ships.add(ship);
            logger.debug(ship);
        }
        // RED_FLAG: test code for other alien Sprites
        Sprite alien = new BigAlien();
        alien.setLocation(new Point(100,0));
        aliens.add(alien);
        alien = new AlienLaser();
        alien.setLocation(new Point(200,0));
        aliens.add(alien);
        alien = new Laser();
        alien.setLocation(new Point(300,0));
        aliens.add(alien);
        window.repaint();
    }

    public static void newGame() {
        newGame(window);
    }

    /**
     * Returns {@link Window} object for this {@link SpaceInvaders} game.
     * @return Window object for this {@link SpaceInvaders} game
     */
    public static Window getWindow() { return window; }

    /** Return square box grid side dimension.
     * @return square box grid side dimension
     */
    public static int getSide() {
        return Math.min(
            window.getWidth() / BOXES_ACROSS, window.getHeight() / BOXES_DOWN);
    }

    /**
     * Move all components based on tick.
     * @param tick current game {@link Timer} tick
     */
    public static void move(long tick) {
        if (tick % 100 == 0) {
            logger.trace("tick: {}", tick / 100);
            // Move aliens.
            for (int i = 0; i < aliens.size(); i++) {
                aliens.get(i).moveRight(getSide() / 2);
            }
        }
    }

    /**
     * Returns the current SpaceShip
     *
     * @return the current Spaceship
     */
    public static SpaceShip getShip(){
        return (SpaceShip) ships.get(0);
    }

    public int getLives(){
        return ships.size();
    }

    public static java.util.List<Sprite> getAliens() {
        return aliens;
    }

    public static java.util.List<Sprite> getShips() {
        return ships;
    }

    /**
     * Pauses the game.
     */
    public static void togglePause() {
        switch(state) {
            case PAUSED:
                state = State.RUNNING;
                break;
            case RUNNING:
                state = State.PAUSED;
                break;
            case OVER:
            default:
                break;
        }
        logger.trace("state: {}", state);
    }
    /**
     * Return true if game is running.
     * @return true if game is running
     */
    public static boolean isRunning() { return state == State.RUNNING; }
    /**
     * Set game {@link State} to OVER.
     */
    public static void gameOver() { state = State.OVER; }
    /**
     * Return true if game is over.
     * @return true if game is over
     */
    public static boolean isGameOver() { return state == State.OVER; }

}