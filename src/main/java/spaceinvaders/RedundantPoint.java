package spaceinvaders;

/**
 * 
 * @author vsoltan
 * @version 1
 *
 * RED_FLAG: use java.awt.Point instead
 */
public class RedundantPoint {

 private final double x, y;

 public RedundantPoint() {
  this(0, 0);
 }

 public RedundantPoint(int x, int y) {
  this(x * 1.0, y * 1.0);
 }

 public RedundantPoint(double x, double y) {
  this.x = x;
  this.y = y;
 }

 public double getX() {
  return x;
 }

 public double getY() {
  return y;
 }

 public boolean equals(RedundantPoint other) {
  return getX() == other.getX() && getY() == other.getY();
 }

 @Override
 public String toString() {
  return "Point(x=" + getX() + ",y=" + getY() + ")";
 }
}
