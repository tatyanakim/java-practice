package assignments;

import java.util.*;

public class ternary {

	public static void main(String[] args) {
		double price = 0.0;
		String storageType, cpu;
		int ram = 0;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE
		double screenSize = 0.0;
		System.out.println("Select screen size:");
		screenSize = scan.nextDouble();
		price = screenSize == 13.3 ? 200 : 0;
		price = screenSize == 15.0 ? 300 : 0;
		price = screenSize == 17.3 ? 400 : 0;
		System.out.println("Select CPU type:");
		cpu = scan.next();
		price += (cpu.equals("i3")) ? 150 : 0;
		price += (cpu.equals("i5")) ? 250 : 0;
		price += (cpu.equals("i3")) ? 350 : 0;
		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		price += (ram / 4) * 50;
		System.out.println("Select storage type:");
		storageType = scan.next();
		System.out.println("Enter memory size:");
		int memory = scan.nextInt();
		if (storageType.equals("SSD")) {
			price += memory / 500 * 100;
		} else if (storageType.equals("HDD"))
			price += memory / 500 * 50;
	

	System.out.println("Enter screen resolution:");

	String resolution=scan.next();price+=(resolution.equals("FULLHD"))||(resolution.equals("4K"))?100:200;
	System.out.println("Laptop price is: "+price);

}

}
