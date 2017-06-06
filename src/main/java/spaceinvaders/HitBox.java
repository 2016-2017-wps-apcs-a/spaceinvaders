package spaceinvaders;

/**
 * @author Deniz Guler
 */
public class HitBox {
    private Point[] corners = new Point[4]; // from top left to bottom right
    private Point center;
    private double size; // from center to corner
    public HitBox(Point center, double size){
        this.size = size;
        this.center = center;
        corners[1] = new Point(size - center.getX(), size + center.getY()); // top left
        corners[2] = new Point(size + center.getX(), size + center.getY()); // top right
        corners[3] = new Point(size - center.getX(), size - center.getY()); // bottom left
        corners[4] = new Point(size + center.getX(), size - center.getY()); // bottom right
    }

    public boolean isInBounds(HitBox other){
        return false;
    }

}
