/*
 * SpaceInvaders.java
 */
package spaceinvaders;

import javax.swing.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * SpaceInvaders is the main class for the SpaceInvaders game.
 *
 * @author 2016-2017 APCS A-Block
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
        logger.info(Utilities.getResourcePaths("/sounds"));
        //SoundFX sound = new SoundFX("~\\spaceinvaders\\src\\main\\resources\\sounds\\some-days-you-just-can_t-get-rid-of-a-bomb.wav");
        //sound.play();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui = new GUI();
            }
        });
    }
}