package day31_voidmethods;
import java.util.Scanner;
public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	countUp(0);//num=5;
	countDown(5);
	countDown(0);
	}





public static void countUp(int num) {
	
	if(num<1) {
		System.out.println("Invalid input");
		
	}
	for(int i=1;i<=num;i++) {
		System.out.print(i+" ");
		
	}
	System.out.println()  ;
}
  
public static void countDown(int num) {
	
	
	if(num<=0) {
		System.out.println("Invalid input");
		System.exit(0);
	}
	for(int n=num;n>=1;n--) {
		System.out.print(n+" ");
	}
	System.out.println();
}








}







