package spaceinvaders;

import java.awt.*;
import org.apache.logging.log4j.*;

/** DESCRIBE {@link Alien} HERE.
 *
 * @author 2016-2017 APCS A-Block
 * @author Noah Criss
 */
public class Alien extends Sprite {

    public Alien() {
        super(new Dimension(80, 80));
        Color black = Color.BLACK, white = Color.WHITE,
            red = Color.RED, green = Color.GREEN, blue = Color.BLUE,
            greenish = new Color (40,60,20);
        // RED_FLAG: debug bounding box
        add(new FilledPolygon(red, null, new int[] { 0, 80, 80, 0, }, new int[] { 0, 0, 80, 80, }));

        add(new FilledPolygon(green, new int[] { 40, 10, 70, }, new int[] { 0, 40, 40, }));
        add(new FilledPolygon(greenish, new int[] { 10, 20, 30, }, new int[] { 40, 50, 50, }));
        add(new FilledPolygon(greenish, new int[] { 70, 60, 50, }, new int[] { 40, 50, 50, }));
        add(new FilledPolygon(red, new int[] { 20, 60, 60, 20, }, new int[] {35, 35, 40, 40, }));
        add(new FilledPolygon(white, new int[] { 20, 25, 30, }, new int[] { 35, 40, 35, }));
        add(new FilledPolygon(white, new int[] { 50, 55, 60, }, new int[] { 35, 40, 35, }));
        add(new FilledPolygon(white, new int[] { 40, 45, 50, }, new int[] { 35, 40, 35, }));
        add(new FilledPolygon(white, new int[] { 30, 35, 40, }, new int[] { 35, 40, 35, }));
        add(new FilledPolygon(white, new int[] { 30, 40, 30, }, new int[] { 20, 30, 30, }));
        add(new FilledPolygon(white, new int[] { 30, 40, 40, }, new int[] { 20, 20, 30, }));
        add(new FilledPolygon(white, new int[] { 40, 50, 40, }, new int[] { 20, 30, 30, }));
        add(new FilledPolygon(white, new int[] { 40, 50, 50, }, new int[] { 20, 20, 30, }));
        add(new FilledPolygon(black, new int[] { 40, 40, }, new int[] { 20,30, }));
        add(new FilledPolygon(blue, new int[] { 33, 37, 37, 33, }, new int[] { 23, 23, 27, 27, }));
        add(new FilledPolygon(blue, new int[] { 43, 47, 47, 43, }, new int[] { 23, 23, 27, 27, }));

        getLogger().debug("{}, size {}, center {}",
            getClass(), getSize(), getCenter());
    }
}