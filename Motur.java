package odev1;

public class Motur extends Vehicle{
private int vites;
 
void printVehicle() {
	System.out.println("motur :" + getBrand() );
}


int getVites(){	
	return vites;
}
void setVites(int vites) {
	this.vites = vites;
}

	public Motur(int vites, String brand, int year, int price) {
		this.vites = vites; 
	}
}
