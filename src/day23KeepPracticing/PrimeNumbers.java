package day23KeepPracticing;
import java .util.Scanner;

public class PrimeNumbers {// is numbers that dividing ONLY for itself and one!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter ptime number: ");
      int num=scan.nextInt();
	
	for(int i=2;i<num; i++) {
		
	    if(num%i==0) {
	    	System.out.println("not prime");
	    }
		}
	System.out.println("its prime");
	
	
	
	
	
	}

}
