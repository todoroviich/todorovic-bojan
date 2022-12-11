package geometry;

public class Point
{
	private int x;
	private int y;
	private boolean selected;
	
	public Point() {}
	public Point(int x, int y) {this.x = x; this.y = y;}
	public Point(int x, int y, boolean selected) {this(x, y); this.selected = selected;}
	
	public double distance(int x ,int y)
	{
		return Math.sqrt((this.x - x)^2 + (this.y - y)^2);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Point)
		{
			Point object = (Point) obj;
			if (x == object.x && y == object.y)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
