package geoMetry;

public class Circle extends Shapes {
	
	private String middlepoint;
	private double radius;
	
	public Circle(double x, double y,double length, double width) {
		this.middlepoint = middlepoint;
		this.setX(x);
		this.setY(y);
		this.setLength(length);
		this.setWidth(width);
		
	}
//function to get middle point
	//????????????????????????
	public double getMiddlepoint() {
		return this.getX()+ this.getY();
	}

	public void setMiddlepoint(String middlepoint) {
		this.middlepoint = middlepoint;
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
	
	//calculates area
	public double calculateArea() {
		return this.getRadius()*this.getRadius()*3.14;
	}
	
	
	
	

}
