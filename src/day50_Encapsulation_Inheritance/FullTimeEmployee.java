package day50_Encapsulation_Inheritance;

public class FullTimeEmployee extends Employee{
	@Override//annotation
	public void calculatePay(int hours,double rate) {
	double total=(rate*hours)*1.05;
System.out.println("FullTime employee total pay: " + total);
}
}