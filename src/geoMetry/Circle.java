package geoMetry;

public class Circle extends Shapes {
	
	private String middlepoint;
	
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
	
	

}
