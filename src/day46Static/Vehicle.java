package day46Static;

public class Vehicle {


 String type;//instance variable

static int numOfVehicle;//shared ,one central value 



public static void VehicleInfo () {
	System.out.println("type: "+type);//will not compile ,type is not  static 
	System.out.println("NUms of vehicle : "+numOfVehicle);
	int count =getNumOfVehicle();
	String make ="Kia".toUpperCase();
	System.out.println("make: "+make);
	//System.out.println(toString());cannot call non static method
	Vehicle vh=new Vehicle();
}



public static int getNumOfVehicle() {
	
	return numOfVehicle;
}
public String toString() {
	return "Vehicle type is : "+type+" | count"+numOfVehicle;
}




















}
