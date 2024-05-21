package exceptions;

public class ElectronicDeviceTest {
	
	public static void main(String[] args) {
		
		try {
			ElectronicDevice ed = new ElectronicDevice("Radio", -100); //alte Version...siehe unten
		} catch (IllegalWattException e) {
			System.out.println("Negative Watt sind nicht erlaubt!");
		}
	}

}



/*
ElectronicDevice ed = new ElectronicDevice();
ed.setName("Radio");
try {
	ed.setWatt(-100);
} catch (IllegalWattException e) {
*/
