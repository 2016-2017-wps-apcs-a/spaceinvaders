package spaceinvaders;

import java.awt.*;

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
    private int[] xs = {2, 4, 6, 6,  4,  2, 0, 0,};
    private int[] ys = {0, 0, 2, 8, 10, 10, 8, 2,};
    //private HitBox hitBox = new HitBox();
    public Laser(){
        super(new Dimension(5, 10));
        this.add(new FilledPolygon(Color.BLACK, Color.WHITE, xs, ys));
    }

    private void move(){

    }


}