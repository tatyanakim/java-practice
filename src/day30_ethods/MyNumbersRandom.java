package day30_ethods;
import java.util.Random;
import java.util.Scanner;
public class MyNumbersRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	showMe5Numbers();
	
	doPush10Times();
	rangePrint();
	}





public static void showMe5Numbers() {
	Random ran=new Random();
	for(int i=1;i<=5;i++) {
	System.out.print(ran.nextInt(1000)+" ");
	}
	
	
}
	
	public static void doPush10Times() {
		
	for(int n=0;n<=10;n++) {
		System.out.println("Push up - " +n);
		
			
	}System.out.println("Time to rest");
	
	
	}
	
	
	
	public static void rangePrint() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 nums: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		if(num1<num2) {
		for(int r=num1;r<=num2;r++) {
		
			System.out.print(r+" ");
		}
		}else if(num1>num2) {
			for(int r=num1;r>=num2;r--) {
				
				System.out.print(r+" ");
		}
		
		}else {
			System.out.println(num1);
		}
		
			
	}

	}
	



















