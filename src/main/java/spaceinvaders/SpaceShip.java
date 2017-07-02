package spaceinvaders;

import java.awt.*;
import org.apache.logging.log4j.*;

/**
 * @author 2016-2017 APCS F-Block
 * @author Deniz Guler
 * @author Jacob Naroian
 */
public class SpaceShip extends Sprite {

    //////////////////////////////// FIELDS ////////////////////////////////

    ///////////////////////////// CONSTRUCTORS /////////////////////////////

    public SpaceShip() {  //creates space ship
        super(new Dimension(200, 200));
        // RED_FLAG: debug bounding box
        add(new FilledPolygon(Color.RED, null, new int[] { 0, 200, 200, 0, }, new int[] { 0, 0, 200, 200, }));

        add(new FilledPolygon(new Color(60, 10, 10), new int[] { 0, 100, 200, }, new int[] { 110, 10, 110, })); //17
        add(new FilledPolygon(Color.RED, new int[] { 40, 160, 160, 40, }, new int[] { 70, 70, 110, 110, })); //16
        add(new FilledPolygon(Color.GRAY, new int[] { 40, 50, 50, 40, }, new int[] { 20, 20, 70, 70, })); //1        
        add(new FilledPolygon(Color.GRAY, new int[] { 160, 150, 150, 160, }, new int[] { 20, 20, 70, 70, })); //7
        add(new FilledPolygon(new Color(100, 30, 10), new int[] { 51, 147, 147, 51, }, new int[] { 65, 65, 130, 130, })); //15
        add(new FilledPolygon(Color.BLACK, new int[] { 60, 140, 140, 60, }, new int[] { 60, 60, 120, 120, })); //10
        add(new FilledPolygon(Color.RED, new int[] { 65, 135, 135, 65, }, new int[] { 65, 65, 115, 115, })); //11
        add(new FilledPolygon(new Color(60, 10, 10), new int[] { 70, 130, 130, 70, }, new int[] { 70, 70, 110, 110, })); //12
        add(new FilledPolygon(Color.RED, new int[] { 80, 95, 95, 80, }, new int[] { 80, 80, 100, 100, })); //13
        add(new FilledPolygon(Color.RED, new int[] { 105, 120, 120, 105, }, new int[] { 80, 80, 100, 100, })); //14
        add(new FilledPolygon(Color.GRAY, new int[] { 60, 140, 140, 60, }, new int[] { 55, 55, 60, 60, })); //9
        add(new FilledPolygon(Color.RED, new int[] { 60, 140, 140, 60, }, new int[] { 50, 50, 55, 55, })); //8
        add(new FilledPolygon(Color.RED, new int[] { 60, 70, 70, 60, }, new int[] { 20, 20, 50, 50, })); //6
        add(new FilledPolygon(Color.RED, new int[] { 130, 140, 140, 130, }, new int[] { 20, 20, 50, 50, })); //5
        add(new FilledPolygon(Color.RED, new int[] { 90, 95, 95, 90, }, new int[] { 0, 0, 50, 50, })); //2
        add(new FilledPolygon(Color.RED, new int[] { 105, 110, 110, 105, }, new int[] { 0, 0, 50, 50, })); //4
        add(new FilledPolygon(Color.GRAY, new int[] { 94, 105, 105, 94, }, new int[] { 0, 0, 60, 60, })); //3
       
        getLogger().debug("{}, size {}, center {}",
            getClass(), getSize(), getCenter());
    }

    //////////////////////////////// METHODS ///////////////////////////////

    /**
     * Moves the ship left.
     */
    public void moveLeft() {
        this.moveLeft(1);
    }

    /**
     * Moves the ship right.
     */
    public void moveRight() {
        this.moveRight(1);
    }
    
    /**
     * Shoots the laser.
     */
    public void shoot() {
        // STUB
    }
}
