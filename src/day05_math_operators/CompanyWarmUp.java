package day05_math_operators;

public class CompanyWarmUp {
public static void main(String[]args) {
	String companyName="Facebook";
	String address="Silicon Valley,Ca";
	int numberOfEmployes=10000;
	long revenue = 4000000L;
	boolean isTechCompany = true;
	
	System.out.println("Company name is: "+ companyName );
	System.out.println("Address is: "+ address);
	System.out.println("The number of employees are: "+numberOfEmployes);
	System.out.println("The revenue is: "+ revenue);
	System.out.println("Is its tech company? "+ isTechCompany);
	
	
	
	
	String aboutCompany;
	aboutCompany="The company name is \""+ companyName+"\". Address is "+address+".\n Number of employees "+ numberOfEmployes +" Revenue is "+ revenue+ " it is tech company ";
	System.out.println(aboutCompany);
	
	
	
}
}
