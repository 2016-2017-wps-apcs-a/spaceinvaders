package spaceinvaders;

/*
 * @author Chris Callahan
 * */

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time implements ActionListener {
    private final int TICK_RATE = 20; // 1 s = 20 tick
    private  long currentTick;
    public Time() {
        Timer timer = new Timer(TICK_RATE, this);
    }
    // action performed every tick with a delay of 1 tick.
    public void actionPerformed(ActionEvent e) {
        currentTick++;
    }

    public long getCurrentTick(){
        return currentTick;
    }

}