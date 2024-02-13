package odev1;

public class Car extends Vehicle {
private int door;
private boolean auto;

void printVehicle() {
	System.out.println("car :" + getBrand() );
}

 int getDoor() {
	 return door;
 }
 void setDoor(int door) {
	if(door <= 0 ) {
		System.out.println("invalid door number");
	}
	else {
	 this.door = door;
	}
 }
 
 boolean getAuto() {
	 return auto;
 }
 void setAuto(boolean auto) {
	 this.auto = auto;
 }
 
	//Vehicle myObj = new Vehicle();
	public Car(int door, boolean auto, String brand, int year, int price) {
		setDoor(door);
		setAuto(auto);
		setBrand(brand);
		setYear(year);
		setPrice(price);
		
	}
	public Car() {
		
	}
}
