package spaceinvaders;

import java.awt.*;

public class FilledPolygon extends Polygon {
	private Color outline, fill;

	public FilledPolygon(Color outline, Color fill, int[] xs, int[] ys) {
		super(xs, ys, Math.max(xs.length, ys.length));
		this.outline = outline;
		this.fill = fill;
	}

	public FilledPolygon(Color color, int[] xs, int ys[]) {
		this(color, color, xs, ys);
	}

	/*
	 * public FilledPolygon(Color color, int x, int y, int width, int height) {
	 * this(color, new int[] { x, x + width - 1, x + width - 1, x }, new int[] {
	 * y, y, y + height - 1, y + height - 1 }); }
	 */
	public Color getOutline() {
		return outline;
	}

	public Color getfill() {
		return fill;
	}

	/*
	 * public int getX() { return this.xpoints[0]; } public int getY() { return
	 * this.ypoints[0]; } public int getWidth() { return xpoints[1] - xpoints[0]
	 * + 1; } public int getHeight() { return ypoints[2] - ypoints[1] + 1; }
	 */
	public void draw(Graphics g) {
		Color color = g.getColor();
		g.setColor(fill);
		g.fillPolygon(this);
		g.setColor(outline);
		g.drawPolygon(this);
		g.setColor(color);
	}
}