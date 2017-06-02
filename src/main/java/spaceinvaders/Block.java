package spaceinvaders;
import java.awt.*;
public class Block {
  private Color color;
  private Rectangle rectangle;
  public Block(Color color, int x, int y, int width, int height) {
    this.color = color;
    this.rectangle = new Rectangle(x, y, width, height);
  }
  public Color getColor() { return color; }
  public int getX() { return (int) rectangle.getX(); }
  public int getY() { return (int) rectangle.getY(); }
  public int getWidth() { return (int) rectangle.getWidth(); }
  public int getHeight() { return (int) rectangle.getHeight(); }
}