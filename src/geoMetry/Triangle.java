package geoMetry;

public class Triangle extends Shapes{
	Coordinates pointA;
	Coordinates pointB;
	Coordinates pointC;
	double[] sideLengths;
	
	private double height;
	public Triangle(double x, double y,double length,double height) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.sideLengths = new double[] {
				calculateLength(pointA, pointB),
				calculateLength(pointB, pointC),
				calculatrLength(pointC, pointA)
		};
		super(x,y);
		this.height = height;
		this.setLength(length);
	}
	
	public double calculateLength(Coordinates pointA, Coordinates pointB) {
		return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) +
				Math.pow(pointA.getY()- pointB.getY(),2));
	}
	public String toString () {
		return "Corner A is at the point: " + this.getCoordinates().getX() + "|" +
				this.getCoordinates().getY()+ "\n\t" + "Length: " + this.getLength()+ 
				"\n\t" + "Width: "+this.getWidth();
	}

}
