package day41;

public class Car {
     
	
	String make;
	String model;
	int speed;
	String color;
	
	
	
	public void printCarInfo() {
		System.out.println("Car make ["+ make+"],"+" model["+model+"]"+ " color[" +color+"] Current Speed["+speed+"]");
	}
	public void showCurrentSpeed(int speedLimit) {
		if(speed<speedLimit) {
			System.out.println(make+" is driving at "+speed +" following speed limit=55");
		}else {
			System.out.println(make+" is driving at "+speed +" over the speed limit=55");
		}
		
	}public void drive() {
		System.out.println(make+" "+model+" is driving....");
	
	
	}public void accellerate(int mph) {
		speed+=mph;
	}
	
	
	
	
}
