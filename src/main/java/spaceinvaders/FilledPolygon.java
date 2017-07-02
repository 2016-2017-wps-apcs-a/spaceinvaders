/*
 * FilledPolygon.java
 */
package spaceinvaders;

import java.awt.*;

/**
 * {@link Sprite} is a {@link JComponent} base class for all on-screen items.
 *
 * @author 2016-2017 APCS F-Block
 */
public class FilledPolygon extends Polygon {
    //////////////////////////////// FIELDS ////////////////////////////////

    private Color outline, fill;

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    public FilledPolygon(Color outline, Color fill, int[] xs, int[] ys) {
        super(xs, ys, Math.max(xs.length, ys.length));
        this.outline = outline;
        this.fill = fill;
    }

    public FilledPolygon(Color color, int[] xs, int ys[]) {
        this(color, color, xs, ys);
    }

    //////////////////////////////// METHODS ///////////////////////////////

    public Color getOutline() {
        return outline;
    }

    public Color getfill() {
        return fill;
    }

    public void draw(Graphics g) {
        assert fill != null || outline != null : "both colors null";
        Color color = g.getColor();
        if (fill != null) {
            g.setColor(fill);
            g.fillPolygon(this);
        }
        if (outline != null) {
            g.setColor(outline);
            g.drawPolygon(this);
        }
        g.setColor(color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[")
            .append(outline).append(":").append(fill).append(":[");
        for (int i = 0; i < xpoints.length; i++)
            sb.append(i > 0 ? "," : "").append(new Point(xpoints[i], ypoints[i]));
        return sb.append("]]").toString();
    }
}