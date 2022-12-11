package geometry;

public class Rectangle
{
	private Point startPoint;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {}
	public Rectangle(Point startPoint, int width, int height) {this.startPoint = startPoint; this.width = width; this.height = height;}
	public Rectangle(Point startPoint, int width, int height, boolean selected) {this(startPoint, width, height); this.selected = selected;}
	
	public int area()
	{
		return width * height;
	}
	
	public int circumference()
	{
		return 2 * (width + height);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Rectangle)
		{
			Rectangle object = (Rectangle) obj;
			if (startPoint.equals(object.getStartPoint()) && width == object.getWidth() && height == object.getHeight())
				return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "Start point: " + startPoint + ", Width: " + width + ", Height: " + height;
	}
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
