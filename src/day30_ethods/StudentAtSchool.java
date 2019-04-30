package day30_ethods;
import java.util.Scanner;
public class StudentAtSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	study("Java");
	study("SQL");
	sleep(10);
	next3();
}


public static void study(String topic) {
	System.out.println("Student is studing: "+topic);
}


public static void sleep(int hours) {
	System.out.println("Student sleeps : "+hours+" hours");
}







public static void next3(){
  Scanner inp = new Scanner(System.in);
   System.out.print("enter number");
   int num = inp.nextInt();
  
   int result=num+1;
   int result2=num+2;
   int result3=num+3;
	  System.out.print(result+" "+result2+" "+result3);
  }
}







