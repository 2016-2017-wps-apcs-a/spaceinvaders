/*
 * Sprite.java
 */
package spaceinvaders;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import org.apache.logging.log4j.*;

/**
 * {@link Sprite} is a {@link JComponent} base class for all on-screen items.
 *
 * @author 2016-2017 APCS F-Block
 * @author Chris Callahan
 * @author Deniz Guler
 * @author Valeriy Soltan
 */
public class Sprite extends JComponent {

    //////////////////////////////// FIELDS ////////////////////////////////

    /** log4j {@link Logger}. */
    private static Logger logger = LogManager.getLogger(SpaceInvaders.SHORT);
    /** Preferred size of this {@link Sprite}. */
    private Dimension preferredSize;
    /** Current size of this {@link Sprite}. */
    private Dimension size;
    /** The list of {@link FilledPolygon}s that define the {@link Sprite}. */
    private java.util.List<FilledPolygon> polys;
    /** Fraction of {@link Sprite} horizontal dimension representing a hit. */
    private static final int HIT_SCALE = 5;

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    public Sprite(Dimension size) {
        polys = new ArrayList<FilledPolygon>();
        this.size = preferredSize = size;
    }

    public Sprite() {
        this(new Dimension(100, 100));   // default size
    }

    //////////////////////////////// METHODS ///////////////////////////////

    /** Return logger for this {@link Sprite}.
     * @return logger for this {@link Sprite}
     */
    public Logger getLogger() { return logger; }

    /** Add {@link FilledPolygon} poly to this {@link Sprite}'s
     * {@link java.util.List}.
     * @param poly {@link FilledPolygon} to add to this {@link Sprite}
     */
    public void add(FilledPolygon poly) {
        polys.add(poly);
    }

    /**
     * Translate this {@link Sprite} by dx & dy.
     * @param dx distance to translate in x direction
     * @param dy distance to translate in y direction
     */
    public void translate(int dx, int dy) {
        for (FilledPolygon poly : polys)
            poly.translate(dx, dy);
        super.setLocation(new Point(getX() + dx, getY() + dy));
    }

    /** Move this {@link Sprite} up.
     * @param d translation distance
     */
    public void moveUp(int d) { translate(0, -d); }

    /** Move this {@link Sprite} down.
     * @param d translation distance
     */
    public void moveDown(int d) { translate(0, d); }

    /** Move this {@link Sprite} left.
     * @param d translation distance
     */
    public void moveLeft(int d) { translate(-d, 0); }

    /** Move this {@link Sprite} right.
     * @param d translation distance
     */
    public void moveRight(int d) { translate(d, 0); }

    /** Return a {@link Rectangle} representing hitbox of this {@link Sprite}.
     * @return hitbox {@link Rectangle}
     */
    private Rectangle getHitbox() {
        // xShift is distance from left to hitBox left.
        int xShift = getWidth() * (HIT_SCALE - 1) / 2 / HIT_SCALE;
        int x = getLocation().x + xShift, y = getLocation().y;
        int width = getWidth() / HIT_SCALE, height = getHeight();
        // RED_FLAG: creates a new Rectangle with every invocation
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

    /** Return center of this {@link Sprite}.
     * @return center of this {@link Sprite}, or (0, 0) if nothing added
     */
    public Point getCenter() {
        if (polys.size() == 0)
            return new Point();
        // RED_FLAG: creates a new Rectangle2D union with every invocation
        Rectangle2D bounds = polys.get(0).getBounds2D();
        for (int i = 1; i < polys.size(); i++)
            bounds = bounds.createUnion(polys.get(i).getBounds2D());
        Point center =
            new Point((int) bounds.getCenterX(), (int) bounds.getCenterY());
        logger.debug("{}, bounds {}, center {}", getClass(), bounds, center);
        return center;
    }

    /** Return true if this {@link Sprite}'s hitbox contains {@link Point} p.
     * @param p {@link Point} to examine for containment in hitbox
     * @return true if p is in hitbox of this {@link Sprite}
     */
    public boolean isHit(Point p) {
        return getHitbox().contains(p);
    }

    @Override
    public void setSize(int width, int height) {
        double xScale = width / size.getWidth();
        double yScale = height / size.getHeight();
        logger.debug("setSize: (xScale) {} (yScale) {}", xScale, yScale);
        int x = getX(), y = getY();
        for (FilledPolygon poly : polys) {
            assert poly.xpoints.length == poly.ypoints.length : "invalid polygon";
            for (int i = 0; i < poly.xpoints.length; i++) {
                poly.xpoints[i] = 
                    (int) Math.round((poly.xpoints[i] - x) * xScale) + x;
                poly.ypoints[i] = 
                    (int) Math.round((poly.ypoints[i] - y) * yScale) + y;
            }
            
        }
        size.setSize(width, height);
    }

    @Override
    public void setSize(Dimension size) {
        // RED_FLAG: setSize(Dimension) calls setSize(int, int) else infinite
        // recursion
        setSize(size.width, size.height);
    }

    @Override
    public Dimension getSize() {
        return size;
    }

    @Override
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    @Override
    public void setLocation(Point p) {
        for (FilledPolygon poly : polys)
            poly.translate((int) (p.getX() - getX()), (int) (p.getY() - getY()));
        super.setLocation(p);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (FilledPolygon poly : polys) {
            poly.draw(g);
        }
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append(getClass().getName()).append(":")
            .append(getLocation()).append(":").append(getSize()).append(":")
            .append(polys).toString();
    }

}