package day12_switch_ternary;
import java.util.Scanner;
public class Calculator_V01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double num1,num2;
		double result=0.0;
		System.out.println("Enter first number:");
		System.out.println("Enter first number:");
		System.out.println("Select operator:+,-,*,/,%");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		String operator=scan.next();
		
	if(operator.contentEquals("+")){
			 result=num1+num2;
			 
		 }else if(operator.contentEquals("-")){
			 result=num1-num2;
			 
		
		 }else if(operator.contentEquals("*")){
			 result=num1*num2;
			
		 
		 }else if (operator.contentEquals("/")){
			 result=num1/num2;
			 
			 
		 }else if(operator.contentEquals("%")){
			 result=num1%num2;
		     
		     }else {
			 System.out.println("Invalid operator selected: "+ operator);
			 return;
		      }
	   System.out.println("Result:"+result);
		 
			
		 }
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

