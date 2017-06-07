/*
 * Sprite.java
 */
package spaceinvaders;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Sprite is a JComponent base class for all on-screen items.
 *
 * @author David C. Petty
 */
public class Sprite extends JComponent {

    private Dimension size;
    private Point location;

    /** The list of <code>FilledPolygons</code> that define the sprite. */
    private java.util.List<FilledPolygon> polys;

    public Sprite() {
        polys = new ArrayList<FilledPolygon>();
        size = new Dimension(100, 100);
        location = new Point();
    }

    public void move(Point p) {
        for (FilledPolygon poly : polys)
            poly.translate((int) (p.getX() - location.getX()), (int)(p.getY() - location.getY()));
        location = p;
    }

    public void add(FilledPolygon poly) {
        polys.add(poly);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (FilledPolygon poly : polys) { poly.draw(g); }
    }
}