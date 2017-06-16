package src.main.java.spaceinvaders;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

// @Jacob Naroian 
public class AlienLaser extends Sprite { 
    public AlienLaser() {
                add(new FilledPolygon(Color.GRAY, new int[] { 25, 20, 30, }, new int[] { 40, 30, 30, })); //1
                add(new FilledPolygon(new Color(60, 10, 10), new int[] { 24, 25, 25, 24}, new int[] { 10, 10, 30, 30 })); //2
    }
}