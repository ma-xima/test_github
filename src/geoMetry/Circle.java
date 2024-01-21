package geoMetry;

public class Circle extends Shapes {
	
	private double middlepoint;
	private double radius;
	
	public Circle(double x, double y, double middlepoint, double radius) {
		this.middlepoint = middlepoint;
		this.radius = radius;
		this.setX(x);
		this.setY(y);
		
	}
//function to get middle point
	//????????????????????????
	public double getMiddlepoint() {
		return this.getX()+ this.getY();
	}

	public void setMiddlepoint(double middlepoint) {
		this.middlepoint = middlepoint;
	}
	
	public String toString () {
		return "The middlepoint is at the point: " + this.middlepoint ;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//calculates circumference
	public double calculateCircumference() {
		return this.getRadius()*2*3.14;
	}
	
	/*public String toString() {
		return "The middlepoint is at the point: " + this.calculateCircumference() ;
	}
	*/
	
	//calculates area
	public double calculateArea() {
		return this.getRadius()*this.getRadius()*3.14;
	}
	
	
	
	

}
