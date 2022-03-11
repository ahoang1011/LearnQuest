package Lab5;

public class Box {
	
	private double height, width, length;
	
	public Box(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	public Box(double side) {
		this(side,side,side);
	}
	
	public double getVolume() {
		return (getHeight() * getWidth() * getLength());
	}
	
	public double getSurfaceArea() {
		return (2 * ((getHeight() * getWidth() + (getWidth() * getLength() + 
				(getHeight() * getLength())))));
	}
	
	public void printBox() {
		if (getHeight() <= 0 || getLength() <= 0 || getWidth() <= 0) {
			System.out.println("Box contains invalid properties");
		}
		else {
			System.out.println("Length = " + getLength());
			System.out.println("Width = " + getWidth());
			System.out.println("Height = " + getHeight());
			System.out.println("Volume = " + getVolume());
			System.out.println("Surface Area = " + getSurfaceArea());
		}
	}
}
