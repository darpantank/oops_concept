package oops;
public class Circle implements Shape{

	private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		super();
	}

	@Override
	public void draw() {
		System.out.println("drawing circle...");
		
	}

	@Override
	public double size() {
		return Math.PI*Math.pow(radius,2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	

}
