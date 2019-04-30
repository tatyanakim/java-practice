package day19_loop;
//import java.util.Random;
import java.util.Scanner;
public class GuestAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	//Random random=new Random();
	int input;
	int secretNumber=60;//=random.nextInt(101);
	int count=0;
	
	do {
		System.out.println("Guess number:");
		input=scan.nextInt();
		count++;
		if(input==secretNumber&&count!=3) {
			System.out.println("Correct");
			return;
		}else if(count==3) {
			System.out.println("Sorry no more chances");
	       return;
			
		
	}else if(input>secretNumber&& count!=3) {
		System.out.println("Its too high");
	}else if(input<secretNumber&& count!=3) {
		System.out.println("Its too low");
	
	}
	}while(secretNumber!=input&&count!=3);
		
		
		
	
	
	
	
	
	
	
	
	
	
	
		
	
	}

	}
