package day08_casting_conditionals;
import java.util.Scanner;
public class VotingEligibility {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int votingAge=18;
		System.out.println("Whats your age: ");
		int yourAge=scan.nextInt();
		
		if(votingAge<=yourAge) {
			System.out.println("You are elibile to vote.\nYou have been eligible for "+ (yourAge-votingAge)+ " years");
		}else {
			System.out.println("You are not eligible to vote.\nYou still have "+(votingAge-yourAge)+ " more years to go!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
