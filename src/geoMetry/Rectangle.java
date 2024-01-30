package geoMetry;

public class Rectangle  extends Shapes{
	
	public Rectangle(double x, double y,double length, double width) {
		super(x,y);
		this.setLength(length);
		this.setWidth(width);	
	}
	
	
	public String toString () {
		return "Corner A is at the point: " + this.getCoordinates().getX() + "|" +
				this.getCoordinates().getY()+ "\n\t" + "Length: " + this.getLength()+ 
				"\n\t" + "Width: "+ this.getWidth();
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
