package day30_ethods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	add(2,2 );
	remainder(2,2);
	substract(2,2);
	multiply(2,2);
	divide(2,2);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++");
	
	Scanner scan=new Scanner(System.in);
	   System.out.println("Enter 2 nums: ");
	   double n1=scan.nextDouble();//will be assigned to num1
	   double n2=scan.nextDouble();//will be assigned to num2
	   System.out.println("Select operation: '+','-','/','*','%'");
	   String operator=scan.next();
	   switch(operator) {
	   case "+":
		   add(n1,n2);//uses add method from the bottom by mentioning the class name
		 
		  break;
	   case"-":
		   substract(n1,n2);
		
		  break;
	   case"*":
		   multiply(n1,n2);
		   
		   break;
	   case "%":
		   remainder(n1,n2);
		  break; 
		  default:
			  System.out.println("Invalid operator");
	   }
	
	}



public static void add(double num1,double num2) {
	double result=num1+num2;
	System.out.println("Result: "+result);
}

public static void substract(double num1,double num2) {
	double result=num1-num2;
	System.out.println("Result: "+result);
}
public static void multiply(double num1,double num2) {
	double result=num1*num2;
	System.out.println("Result: "+result);
}
public static void divide (double num1,double num2) {
	double result=num1/num2;
	System.out.println("Result: "+result);
}
public static void remainder(double num1,double num2) {
	double result=num1%num2;
	System.out.println("Result: "+result);
}
 







}
