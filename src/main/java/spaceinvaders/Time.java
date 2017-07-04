/*
 * Time.java
 */
package spaceinvaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import org.apache.logging.log4j.*;

/**
 * {@link Time} handles all timing for {@link SpaceInvaders} game.
 *
 * @author 2016-2017 APCS A-Block
 * @author Chris Callahan
 * @author Deniz Guler
 * @author Valeriy Soltan
 */
public class Time implements ActionListener {

    //////////////////////////////// FIELDS ////////////////////////////////

    /** {@link Window} redraw delay (in ms). */
    public static final int TICK = 50;

    /** Holds {@link Window} redraw {@link Timer}. */
    private Timer clock;
    /** Tick that synchronizes all game timing. */
    private long currentTick = 0;

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    /**
     * Constructs a new game {@link Timer}.
     */
    public Time() {
        currentTick = 0;
        clock = new Timer(TICK, this);
        //clock.setInitialDelay(0); // RED_FLAG: needed?
        clock.start();
    }

    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Accessor method for currentTick.
     * @return current game time base
     */
    public long getCurrentTick() {
        return currentTick;
    }

    /**
     * Invoked when a ({@link Timer}) action occurs.
     * 
     * @param e the {@link ActionEvent}
     */
    public void actionPerformed(ActionEvent e) {
        if (Game.isRunning()) {
            currentTick++;
            Game.move(currentTick);          // move the components
            //Game.getWindow().repaint();      // repaint the window
            //Game.getWindow().scoreUpdate();  // update score
        }
    }
}