package day20_forloop;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter number: ");
       int num=scan.nextInt();
       if(num<=0||num>10) {
    	   System.out.println("num not valid");
    	   return;
       }
       for(int i=1;i<=10;i++) {
    	  int multiplication=num*i;
    	  
    	   System.out.println(num+" x "+i+" = "+multiplication);
    	 }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
