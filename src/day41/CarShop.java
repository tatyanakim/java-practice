package day41;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Car car=new Car();
	car.make="Ford";
	car.model="Fiesta";
	car.color="black";
	car.speed=87;
	
	
	car.printCarInfo();
	car.showCurrentSpeed(car.speed);
	car.drive();
	car.accellerate(10);
	car.showCurrentSpeed(car.speed);
	
	
	
	
	}
	

}
