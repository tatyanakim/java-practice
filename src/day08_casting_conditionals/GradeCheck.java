package day08_casting_conditionals;
import java.util.Scanner;

public class GradeCheck {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("###START PROGRASMM###");
		System.out.println("Enter your grade A)B)C)D): ");
		char grade=scan.next().charAt(0);
		if (grade=='A') {
			System.out.println("Excellent job!Keep it up! \n\n##END PROGRAMM####");
		}else {
			System.out.println("How many points did you miss for \"A\".");
			int points=scan.nextInt();
			System.out.println("Your grade \""+grade+"\" is not good enough.");
			System.out.println("You could earn "+ points+ " more points,if you study harder.");         
		}
	}

}
