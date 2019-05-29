package day41;

public class Microwave {


String brand;
boolean isOn;





public void  turnOn() {
	if(isOn==true) {
		System.out.println(brand+ " microwave is already ON");
	}else {
		System.out.println("Turning ON "+brand +" microwave");
	}
}public void turnOff() {
		if(isOn==true) {
			System.out.println("Turning off the " +brand+" microwave");
		}else {
			System.out.println("Already off.Turning on....");
		}
	}
public void heat(String food) {
	if(isOn==true) {
		System.out.println("Heating on your "+food);
	}else {
		System.out.println("Microwave "+ brand+" is OFF.Cant heat on your "+food);
	}
}
}






