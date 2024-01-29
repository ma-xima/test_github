package geoMetry;

public class Triangle extends Shapes{
	
	private double hight;
	public Triangle(double x, double y,double length,double hight) {
		super(x,y);
		this.hight = hight;
		this.setLength(length);
	}
	
	
	public String toString () {
		return "Corner A is at the point: " + this.getCoordinates().getX() + "|" +
				this.getCoordinates().getY()+ "\n\t" + "Length: " + this.getLength()+ 
				"\n\t" + "Width: "+this.getWidth();
	}

}
