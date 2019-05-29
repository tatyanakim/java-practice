package day49_2Inheritance02;
import day49_01Inheritance01.Device;

//ipad is a device ipad is a sub class in a different package 
public class IPad extends Device{

	public void readEbook (String title) {
		System.out.println("Reading a book "+title+" using "+brand +" ipad");
		System.out.println("Model- "+model);
		//System.out.println("Price: "+price);not visible not inherited
		
		
		
		
		
	}
	
	
	
}
