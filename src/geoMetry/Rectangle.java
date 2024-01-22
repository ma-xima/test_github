package geoMetry;

public class Rectangle  extends Shapes{
	
	Coordinates cornerA;
	private double radius;
	public Rectangle(double x, double y,double length, double width, Coordinates cornerA, double radius) {
		this.cornerA = cornerA;
		this.setX(x);
		this.setY(y);
		this.setLength(length);
		this.setWidth(width);	
	}
	

	public double getCornerA() {
		return this.getX()+ this.getY();
	}

	public void setCornerA(Coordinates cornerA) {
		this.cornerA = cornerA;
	}
	
	public String toString () {
		return "Corner A is at the point: " + this.cornerA ;
	}
	
	//calculates circumference
	public double calculateCircumference() {
		return (this.getLength()+ this.getWidth())*2;
	}
	
	//calculates area
	public double calculateArea() {
		return this.getLength() * this.getWidth(); 
	}
	
	
	
	
	
	
	

	

	

}
