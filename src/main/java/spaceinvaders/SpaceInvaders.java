/*
 * SpaceInvaders.java
 */
package spaceinvaders;
import org.apache.logging.log4j.*;
import javax.swing.*;
import java.util.*;

/**
 * SpaceInvaders is the main class for the SpaceInvaders game.
 *
 * @author David C. Petty
 */
public class SpaceInvaders {
    /** LONG name of this project. */
    public static final String LONG = "SpaceInvaders";
    /** SHORT name of this project. */
    public static final String SHORT = "SI";
    /** log4j logger. */
    private static Logger logger = LogManager.getLogger(SHORT);
    
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
     * @param args
     *            command-line argument array
     */
    public static void main(String[] args) {
        logger.info("# SpaceInvaders");
        SoundFX sound = new SoundFX("sounds/some-days-you-just-can't-get-rid-of-a-bomb.mp3");
        sound.play("sounds/some-days-you-just-can't-get-rid-of-a-bomb.mp3");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui = new GUI();
            }
        });
    }
}