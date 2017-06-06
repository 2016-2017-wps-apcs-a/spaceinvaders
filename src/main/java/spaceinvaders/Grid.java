package spaceinvaders;
import javax.swing.*;
import java.awt.*;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * This is a class purely for testing movement
 * @author Deniz Guler
 */
public class Grid extends JFrame {

        Panel panel;
        Button b1,b2,b3;
        SpaceShip s1;
        public Grid()
        {

            // Set frame properties
            setTitle("AWT Panel"); // Set the title
            setSize(400,400); // Set size to the frame
            setLayout(new FlowLayout()); // Set the layout
            setVisible(true); // Make the frame visible
            setLocationRelativeTo(null);  // Center the frame

            // Create the panel
            panel=new Panel();

            // Set panel background
            panel.setBackground(Color.gray);

            // Create buttons
            b1 = new Button("+x"); // Create a button with default constructor

            b2 = new Button("+y"); // Create a button with sample text

            b3 = new Button("Reset");

            // Create spaceship
            s1 = new SpaceShip();
            // Add the buttons to the panel
            panel.add(b1);
            panel.add(b2);
            panel.add(b3);

            // Add the panel to the frame
            add(panel);

        }
        public static void main(String args[])
        {
            new Grid();
        }
}
