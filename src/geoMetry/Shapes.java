package geoMetry;

public abstract class Shapes {
	private Coordinates coordinates;
	private double length;
	private double width;
	
	public Shapes(double x, double y) {
		this.coordinates = new Coordinates(x,y);
	}
	
	
	public Coordinates getCoordinates() {
		return coordinates;
	}


	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
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
		return "length:"+this.length + "width:"+this.width +"\n\t"+ "x="+ this.coordinates;
	}
	
	
	//????????????????????????????????????????????????????????
	
}
