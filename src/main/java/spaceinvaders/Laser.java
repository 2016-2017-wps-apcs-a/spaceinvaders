package spaceinvaders;

import java.awt.*;
import org.apache.logging.log4j.*;

/**
 * @author Chris Callahan, Deniz Guler
 * 
 * @Laser models a projectile from the Spaceship object that has a damage
 *        component and its own hit box.
 * 
 *        Laser models a projectile from the Spaceship object that has a damage
 *        component and its own hit box.
 * 
 */
public class Laser extends Sprite{
    public Laser(){
        super(new Dimension(6, 10));
        // RED_FLAG: debug bounding box
        add(new FilledPolygon(Color.RED, null,
            new int[] { 0, 6, 6, 0, }, new int[] { 0, 0, 10, 10, }));

        add(new FilledPolygon(Color.BLACK, Color.WHITE, 
            new int[] { 2, 4, 6, 6,  4,  2, 0, 0, },
            new int[] { 0, 0, 2, 8, 10, 10, 8, 2, }));
        
        getLogger().debug("{}, size {}, center {}",
            getClass(), getSize(), getCenter());
    }

    private void move(){
        this.moveUp(2);
    }
}