/*
 * Sound.java
 */
package spaceinvaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Describe the Sound class...
 *
 * @author Jennifer Kim
 * @author Brandon Zhang
 */
public class Sound extends JFrame
     implements ActionListener
{
  /** Spaceship sound. */
  private SoundFX spaceship;
  private int time;

  
  // fix
  public Sound()
  {
    super("Morning");
    
    time = 0;
    Timer clock = new Timer(5000, this);
    clock.start();

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public static void main(String[] args)
  {
    /*SoundFX sound = new SoundFX();
    SoundFX.setSize(300, 150);
    SoundFX.setDefaultCloseOperation(EXIT_ON_CLOSE);
    SoundFX.setVisible(true);*/
	  }
  
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();
     if (time == 0) 
    {
        c.setBackground(Color.BLACK);
        time += 5000;
    }
    
    else
    {
        c.setBackground(Color.WHITE);
        time = 0;
    }
  }
}