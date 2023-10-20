package oops;
public class Square implements Shape {
	private double length;
	
	public Square(double length) {
		super();
		this.length = length;
	}
	
	@Override
	public void draw() {
		System.out.println("drawing square...");
		
	}

	@Override
	public double size() {
		return Math.pow(length,2D);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	
	
}
