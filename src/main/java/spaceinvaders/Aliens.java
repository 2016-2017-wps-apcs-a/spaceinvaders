package spaceinvaders;

import java.awt.*;
import org.apache.logging.log4j.*;

/**
 * @author Jason Provanzano
 */

public class Aliens extends Sprite {

    public Aliens() {
        super(new Dimension(100, 100));
        // RED_FLAG: debug bounding box
        add(new FilledPolygon(Color.RED, null, new int[] { 0, 100, 100, 0, }, new int[] { 0, 0, 100, 100, }));

        add(new FilledPolygon(Color.ORANGE, new int[] {0,0,100,100}, new int[] {0,100,0,100}));
        add(new FilledPolygon(Color.BLACK, new int[] {25,25,75,75}, new int[] {50,70,50,70}));
        add(new FilledPolygon(Color.BLACK, new int[] {5,5,25,25}, new int[] {30,50,30,50}));
        add(new FilledPolygon(Color.BLACK, new int[] {75,75,95,95}, new int[] {30,50,30,50}));
        add(new FilledPolygon(Color.RED, new int[] {10,10,20,20}, new int[] {35,45,35,45}));
        add(new FilledPolygon(Color.RED, new int[] {80,80,90,90}, new int[] {35,45,35,45}));
        add(new FilledPolygon(Color.WHITE, new int[] {25,35,30}, new int[] {70,70,50}));
        add(new FilledPolygon(Color.WHITE, new int[] {30,40,35}, new int[] {50,50,70}));
        add(new FilledPolygon(Color.WHITE, new int[] {35,45,40}, new int[] {70,70,50}));
        add(new FilledPolygon(Color.WHITE, new int[] {40,50,45}, new int[] {50,50,70}));
        add(new FilledPolygon(Color.WHITE, new int[] {45,55,50}, new int[] {70,70,50}));
        add(new FilledPolygon(Color.WHITE, new int[] {50,60,55}, new int[] {50,50,70}));
        add(new FilledPolygon(Color.WHITE, new int[] {55,65,60}, new int[] {70,70,50}));

        getLogger().debug("{}, size {}, center {}",
            getClass(), getSize(), getCenter());
    }
}