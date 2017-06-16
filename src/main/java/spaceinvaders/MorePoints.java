package src.main.java.spaceinvaders;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

// @Jacob Naroian 
public class MorePoints extends Sprite {
    public MorePoints() {  
        add(new FilledPolygon(Color.BLUE, new int[] { 60, 70, 70, 60, 50, 50, }, new int[] { 30, 40, 60, 70, 60, 40, })); 
        add(new FilledPolygon(Color.YELLOW, new int[] { 54, 62, 66, 62, 54, }, new int[] { 40, 44, 50, 56, 60 }));
          
    }  
 }
