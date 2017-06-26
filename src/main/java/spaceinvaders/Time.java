package spaceinvaders;

/*
 * @author Chris Callahan
 * */

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time implements ActionListener {
    private final int TICK_RATE = 10; // 20ms = 1 tick
    private long currentTick;
    private Timer clock;
    public Time() {
        currentTick = 0;
        clock = new Timer(TICK_RATE, this);
        clock.setInitialDelay(0);
        clock.start();
    }
    // action performed every tick.
    public void actionPerformed(ActionEvent e) {
        currentTick++;
        //if (currentTick % 1 == 0)
        //    GUI.move();
        //GameLogic.getShip().moveDown(2);
        //System.out.print("*" + getCurrentTick());
    }

    public long getCurrentTick(){
        return currentTick;
    }
}