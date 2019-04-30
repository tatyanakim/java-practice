package day19_loop;
import java.util.Scanner;
public class EnterPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
   String password="abs123";
   String input;
   do {
   System.out.println("Enter your password");
   input=scan.next();
   
   
   }while(!input.equals(password));
   System.out.println("Correct!!!");
   
   
   
   
   
   
   
   
   
   
	}

}
