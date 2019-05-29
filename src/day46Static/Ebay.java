package day46Static;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	   //constructor 
	Customer cus1=new Customer("Abdallah Alies", "abdallah@gmail.com");
	Customer cus2=new Customer("Adilet Kyrgys","adilet@hotmail.com");
	Customer cus3=new Customer("Anastasiya Zasibna","anastasia@yahoo.com");
	
	
	  //count is0 from each customer,but when static count all three
	System.out.println(cus3.count);
	
	System.out.println(Customer.count);
	
	//everytime we create object=count++; cuz static is a one central copy
	Customer cus4=new Customer("Burac Ucal","burakgmail.com");
	System.out.println(Customer.count);
	
	
	cus1.count=10;
	System.out.println(cus3.count);
	System.out.println(Customer.count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
