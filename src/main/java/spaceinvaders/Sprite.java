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
    /** The list of <code>FilledPolygons</code> that define the sprite. */
    private java.util.List<FilledPolygon> polys;

    public Sprite() {
        polys = new ArrayList<FilledPolygon>();
    }

    public Sprite(Dimension size) {
        this();
        setPreferredSize(size);
    }

    public void add(FilledPolygon poly) {
        polys.add(poly);
    }

    @Override
    public void setSize(Dimension size) {
        if (getSize().equals(new Dimension(0, 0)))
            super.setSize(getPreferredSize());
        double xFactor = size.getWidth() / getWidth();
        double yFactor = size.getHeight() / getHeight();
        for (FilledPolygon poly : polys) {
            assert poly.xpoints.length == poly.ypoints.length : "invalid polygon";
            for (int i = 0; i < poly.xpoints.length; i++) {
                poly.xpoints[i] = (int) Math.round(poly.xpoints[i] * xFactor);
                poly.ypoints[i] = (int) Math.round(poly.ypoints[i] * yFactor);
            }
        }
        super.setSize(size);
    }

    //@Override
    public void setLocation(Point p) {
        for (FilledPolygon poly : polys)
            poly.translate((int)(p.getX() - getX()), (int)(p.getY() - getY()));
        super.setLocation(p);
    }

    //@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (FilledPolygon poly : polys) {
            poly.draw(g);
        }
    }
}