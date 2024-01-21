package geoMetry;

public abstract class Shapes {
	private double x;
	private double y;
	private double length;
	private double width;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public String toString() {
		return "length:"+this.length + "width:"+this.width +"\n\t"+ "x="+this.x + "y="+this.y;
	}
	
	
	//????????????????????????????????????????????????????????
	
}
