package geoMetry;

public class Triangle extends Shapes{
	Coordinates pointA;
	Coordinates pointB;
	Coordinates pointC;
	double[] sideLengths;
	
	private double height;
	public Triangle(Coordinates pointA, Coordinates pointB, Coordinates pointC, 
			double x, double y,double length,double height) {
		super(x,y);
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.height = height;
		this.setLength(length);
		this.sideLengths = new double[] {
				calculateLength1(pointA, pointB),
				calculateLength2(pointB, pointC),
				calculateLength3(pointC, pointA)
		};
	}
	
//Getter + Setter
	public Coordinates getPointA() {
		return pointA;
	}

	public void setPointA(Coordinates pointA) {
		this.pointA = pointA;
	}

	public Coordinates getPointB() {
		return pointB;
	}

	public void setPointB(Coordinates pointB) {
		this.pointB = pointB;
	}

	public Coordinates getPointC() {
		return pointC;
	}

	public void setPointC(Coordinates pointC) {
		this.pointC = pointC;
	}

	public double[] getSideLengths() {
		return sideLengths;
	}

	public void setSideLengths(double[] sideLengths) {
		this.sideLengths = sideLengths;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

//Calculates 1st side
	public double calculateLength1(Coordinates pointA, Coordinates pointB) {
		return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) +
				Math.pow(pointA.getY()- pointB.getY(),2));
	}

//Calculates 2nd side
	public double calculateLength2(Coordinates pointB, Coordinates pointC) {
		return Math.sqrt(Math.pow(pointB.getX() - pointC.getX(), 2) +
				Math.pow(pointB.getY()- pointC.getY(),2));
	}

//Calculates 3rd side
	public double calculateLength3(Coordinates pointC, Coordinates pointA) {
		return Math.sqrt(Math.pow(pointC.getX() - pointA.getX(), 2) +
				Math.pow(pointC.getY()- pointA.getY(),2));
	}
	
//Calculates Area ????
	public double calculateArea() {
		return height;
		
	}
//Calculates Circumference ?????
	public double calculateCircumference() {
		return this.getSideLengths();
	}
	public String toString () {
		return "Corner A is at the point: " + this.getCoordinates().getX() + "|" +
				this.getCoordinates().getY()+ "\n\t" + "Length: " + this.getLength()+ 
				"\n\t" + "Width: "+this.getWidth();
	}

}
