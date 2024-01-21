package geoMetry;

public class Triangle extends Shapes{
	
	private double cornerA;
	private double hight;
	public Triangle(double x, double y,double length, double cornerA) {
		this.cornerA = cornerA;
		this.hight = hight;
		this.setX(x);
		this.setY(y);
		this.setLength(length);
	}
	
	public double getCornerA() {
		return this.getX()+ this.getY();
	}

	public void setCornerA(double middlepoint) {
		this.cornerA = cornerA;
	}
	
	public String toString () {
		return "Corner A is at the point: " + this.cornerA ;
	}

}
