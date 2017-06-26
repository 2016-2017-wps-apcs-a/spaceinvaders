package spaceinvaders;

/**
 * Adds sound effects to the overall game
 * 
 * @Jennifer Kim, Brandon Zhang
 * @6/1/17
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Sound extends JFrame
{
  private SoundFX spaceship;
  private int time;
  private String name;

  public Sound(String name)
  {
    super("Sound");
    spaceship = new SoundFX(name);
    spaceship.play();
  }
}