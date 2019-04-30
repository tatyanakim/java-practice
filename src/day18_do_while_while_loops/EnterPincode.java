package day18_do_while_while_loops;
import java.util.Scanner;
public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
   /* int secretPin=1234;
    
    int pin=0;
     
    while(pin!=secretPin) {
    	System.out.println("Enter pin: ");
    	pin=scan.nextInt();
    
    }System.out.println("Access granted");*/
    int atempts=0;
	int pin=0;
	int secretPin2=4321;
	while(pin!=secretPin2) {
		System.out.println("Enter pin: ");
		pin=scan.nextInt();
		atempts++;
		
		
	if(atempts==3&&pin!=secretPin2){
			System.out.println("card is blocked");
	      return;
	}
	
	}
	System.out.println("access!");
	
	
		
		
		
	
	
	
	
	}
	
	}


