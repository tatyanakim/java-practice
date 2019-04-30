package day09_stringequals_conditionals;
import java.util.Scanner;
public class Canada {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is the capital of Canada?");
		String capital=keyboard.nextLine();
		if (capital.equals("Ottawa")) {
	     System.out.println("Your answer is correct");
		}else {
			System.out.println("Your answer is incorrect!");
		}
 //capital.equalsIgnoreCase it doesn't matter lower or upper case!!!!
}
}
