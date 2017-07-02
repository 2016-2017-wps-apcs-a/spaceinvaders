/*
 * SpaceInvaders.java
 */
package spaceinvaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.logging.log4j.*;

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
    /** log4j {@link Logger}. */
    private static Logger logger = LogManager.getLogger(SHORT);

    /**
     * Snake Game main method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        logger.info("# SpaceInvaders");
        // SoundFX test code
        logger.info(Utilities.getResourcePaths("/sounds"));
        //SoundFX sound = new SoundFX("sounds/some-days-you-just-can_t-get-rid-of-a-bomb.wav");
        //sound.play();
  
        final JFrame frame = new JFrame("SpaceInvaders");
        frame.setLocation(new Point(100, 100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();

        // Initialize game with new Window.
        final Window window = new Window();
        window.addKeyListener(new Keyboard());
        window.setFocusable(true);
        c.add(window);        
        frame.pack();
        frame.setVisible(true);
        Game.newGame(window);

        // Add ComponentAdapter to manage resizing window.
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension frameSize = frame.getSize();
                Dimension windowSize = window.getSize();
                // Find difference between frame and window.
                int diffWidth = frameSize.width - windowSize.width;    //
                int diffHeight = frameSize.height - windowSize.height; //
                Dimension preferredSize = window.getPreferredSize();
                if (windowSize.width < preferredSize.width
                    || windowSize.height < preferredSize.height) {
                    frame.setSize(
                        Math.max(frameSize.width, preferredSize.width + diffWidth),
                        Math.max(frameSize.height, preferredSize.height + diffHeight));
                }
            }
        });
    }
}