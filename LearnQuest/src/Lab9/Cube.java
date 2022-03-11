package Lab9;

public class Cube extends Box {
	
	public Cube(double side) {
		super(side);
	}
	
	public void setSide(double side) {
		if (side <= 0) {
			System.out.println("Cube values are not valid");
			return;
		}
		
		super.setLength(side);
		super.setWidth(side);
		super.setHeight(side);
		
	}
	
	public double getSide() {
		return getLength();
	}
	
	@Override
	public void setLength(double length) {
		if (getLength() != length)
			setSide(length);
	}

	@Override
	public void setWidth(double width) {
		if (getLength() != width)
			setSide(width);
	}
	
	@Override
	public void setHeight(double height) {
		if (getLength() != height)
			setSide(height);
	}
	
}
