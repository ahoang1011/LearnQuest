package Lab9;

public class Box {
	
	private int height, width, length;
	
	Box(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

}
