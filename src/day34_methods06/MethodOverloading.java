package day34_methods06;

import java.util.Arrays;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	add("ya","o");
	long l1=123L;
	long l2=3455L;//converted to long
	add(l1,l2);
	add(34.00,4);//picked double
	}
	
	
	
	
	
	
	
	
	public static void add(int num,int num2) {
		int result=num+num2;
		System.out.println("Result: "+result);
	}
	public static void add(double d,double d2) {
		double result=d+d2;
		System.out.println("Result: "+ result);
	}
	public static void add(String s,String  s2) {
		String result=s+s2;
		System.out.println("Result: "+result);
	

}
}