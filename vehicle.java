package odev1;

abstract class Vehicle {
 
	private int year;
	private int price;

	private String brand;
	
	
	int getYear() {
		
		return year;
	}
	void setYear(int year) {
		if(year < 1900) {
			System.out.println("invalid year");

		}
		else {
		this.year = year;
		}
	}
	
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		if(price < 0) {
			System.out.println("invalid price");
		}
		else {
		this.price = price;
		}
	}
	
	String getBrand() {
		return brand;
	}
	void printVehicle() {
		
	}
	void setBrand(String brand) {
		if(brand.equals(null)) {
			System.out.println("invalid brand");
		}else {
			this.brand = brand;
		}
		
	}
	
}








/*public vehicle(int year, int price, int doorCount, String brand) {
this.year = year;
this.brand = brand;
this.doorCount = doorCount;
this.price = price;



}
	*/
