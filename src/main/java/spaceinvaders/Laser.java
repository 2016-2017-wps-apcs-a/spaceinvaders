package spaceinvaders;

/**
 * @author Chris Callahan
 * 
 * @Laser models a projectile from the Spaceship object that has a damage
 *        component and its own hit box.
 * 
 *        Laser models a projectile from the Spaceship object that has a damage
 *        component and its own hit box.
 * 
 */
public class Laser {

	private int damg = 0;

	public Laser(int damage, HitBox box) {
		this.damg = damage;
	}

	public int getDamg() {
		return damg;
	}

	public void move() {
	    
	}

	public void hit() {

	}

	public Laser() {

	}

}