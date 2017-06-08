package spaceinvaders;
import java.awt.*;

/**
 * @author Deniz Guler
 * @author vsoltan
 * @author Chris Callahan
 */
public class HitBox {
 private Point[] corners = new Point[4]; // from top left to bottom right
 private Point center = new Point();
 private double size; // from center to corner

 public HitBox(Point center, double size) {
  this.size = size;
  this.center = center;
  corners[0] = new Point((int) (size - center.getX()), (int) (size + center.getY())); // top
                   // left
  corners[1] = new Point((int) (size + center.getX()), (int) (size + center.getY())); // top
                   // right
  corners[2] = new Point((int) (size - center.getX()), (int) (size - center.getY())); // bottom
                   // left
  corners[3] = new Point((int) (size + center.getX()), (int) (size - center.getY())); // bottom
                   // right
 }

 public boolean isInBounds(HitBox other) {
  return false;
 }

 public Point getCenter() {
  return this.center;
 }

 public double size() {
  return this.size;
 }

}
