package day08_casting_conditionals;
import java.util.Scanner;
public class IfElseScanner {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		 
		 int passingPercentage=65;
		 System.out.println("Enter your score: ");
		 int scorePercentage=scanner.nextInt();
		 if (scorePercentage>=passingPercentage) {
			  System.out.println("You passsed!");//true -run , if false skip
		 }else {
			  System.out.println("You failed!\nTry again!");//if false
		  }
		 
		System.out.println("Java is fun!");//outside of else
		
		
	}

	
}
