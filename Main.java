package odev1;

public class Main {
	public static void main(String[] args) {
Vehicle c1 = new Car(4, true, "mercedes" , 2004, 9999);
Vehicle c2 = new Car(2, false, "toyota" , 2004, 9999);
Vehicle m1 = new Motur(7, "mercedes" ,2002,7800);
Vehicle m2 = new Motur(14, "hayabusa" , 2020, 100000);
Vehicle[] vehicles = new Vehicle[10];
vehicles[0] = c1; 
vehicles[1] = c2;
vehicles[2] = m2;
Billionaire b1 = new Billionaire("john" , 10 , vehicles );
b1.printBil();
Billionaire b2 = new Billionaire("lennon" , 10 , vehicles );

b2.buy(c1, b1);

b2.printBil();
	}
	}
