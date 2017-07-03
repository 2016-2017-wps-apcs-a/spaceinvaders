package spaceinvaders;

import java.awt.*;
import org.apache.logging.log4j.*;

/** DESCRIBE {@link AlienLaser} HERE.
 * @author 2016-2017 APCS A-Block
 * @author Jacob Naroian 
 */
public class AlienLaser extends Sprite { 
    public AlienLaser() {
        super(new Dimension(10, 30));
        // RED_FLAG: debug bounding box
        add(new FilledPolygon(Color.RED, null, new int[] { 0, 10, 10, 0, }, new int[] { 0, 0, 30, 30, }));
  
        add(new FilledPolygon(Color.GRAY,
            new int[] { 5, 0, 10, }, new int[] { 30, 20, 20, })); //1
        add(new FilledPolygon(new Color(60, 10, 10),
            new int[] { 4, 5, 4, 5}, new int[] { 0, 0, 20, 20 })); //2

        getLogger().debug("{}, size {}, center {}",
            getClass(), getSize(), getCenter());
    }
}