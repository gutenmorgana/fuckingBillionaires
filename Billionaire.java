package odev1;
import java.util.ArrayList;

public class Billionaire {
private String name;
private int cash = 100000;
private Vehicle[] garage;
private int Capacity;

private static int billionaireCount;

void setCapacity(int Capacity) {
	this.Capacity = Capacity;
}
int getCapacity() {
	return Capacity;
}

 private void increaseBillionaireCount() {
    billionaireCount++;
}
 public void printBil() {
	    System.out.println("Billionaire: " + getName());
	    for (int i = 0; i < Capacity; i++) {
	        if (garage[i] != null) { 
	            garage[i].printVehicle(); 
	        }
	    }
 }

 int getBillionaireCount() {
    return billionaireCount;
}
 void setName(String name) {
	 if(!name.equals(null)) {
	 this.name = name;
	 }
 }
 String getName() {
	 return name;
 }
 
public Billionaire(String name,int Capacity, Vehicle[] garage) {
	this.name = name;
	this.garage = garage;
	this.Capacity = Capacity;
	increaseBillionaireCount();
}

void buy(Vehicle vehicleToBuy, Billionaire billionaireToBuy){
	int price = vehicleToBuy.getPrice();
	if(price > cash) {
		System.out.println("you dont have enough money");
	}
	boolean spot = false;
	int i = 0;
	for( i = 0; i < garage.length; i++) {
		if(garage[i] == null) {
			spot = true;
			break;
		}
	}
	if(spot == false) {
		System.out.println("you dont have any space for a vehicle");
	}
	billionaireToBuy.garage[i] = vehicleToBuy; 
	cash -= price;
	
	
}
void sell(Vehicle vehicleToSell, Billionaire BillionaireToSell) {
	int price = vehicleToSell.getPrice();
	for(int i = 0; i < garage.length; i++) {
		if(vehicleToSell == garage[i]) {
			BillionaireToSell.garage[i] = null;
		}
	}
	cash += price;
}


}
	