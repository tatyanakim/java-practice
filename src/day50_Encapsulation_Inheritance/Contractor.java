package day50_Encapsulation_Inheritance;

public class Contractor extends Employee{
	@Override
	public void calculatePay(int hours,double rate) {
		
		double total=(rate*hours)+200;
	System.out.println("Contractor  total pay: " + total);
	}
	
	
}
