package day18_do_while_while_loops;
import java.util.Scanner;
public class GiveMe5Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
     int total=0;
	int dollars=0;
	while(total!=5) {
	System.out.println("Give me dollars");
	dollars =scan.nextInt();
    total+=dollars;
	}
	
	System.out.println("Thanks");
	
	
	
	
	
	
	
	}

}
