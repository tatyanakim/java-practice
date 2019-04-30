package day12_switch_ternary;
import java.util.Scanner;
public class SwitchScore {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	/*	int score=3;
		switch(score) {
		case 1:
			System.out.println("Score is 1");
			break;
		case 2:
			System.out.println("Score is 2");
		    break;
		case 3:
			System.out.println("Score is 3");
		    break;
	//+++++++++++++++++++++++++++++++++++++++++++++++++	
		Scanner scan=new Scanner(System.in);
	    int day=scan.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:	
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:	
			System.out.println("Saturday");
		    break;
		case 7:
			System.out.println("Sunday");
			break;
			
		 default:
			System.out.println("Not such a day");
		    break;}*/
	
	
		
	
	///////////////////////////////////////////////////////////
	
	/*String weather=scan.next();
	
	 switch(weather) {
	 case "sunny":
		 System.out.println("Go to park.\nCode Java");
		 break;
	 case "hot":
		 System.out.println("Go swimming.\nCode Java");
		 break;
	 case "windy":
		 System.out.println("Fly a kite. \nCode Java");
		 break;
	 case"rainy":
		 System.out.println(" Go shopping.\nCode Java");
		 break;
	 case"snow":
	      System.out.println("Chain your tyres.\n Go skiing.\n Code Java");
	      break;
	 default:
		System.out.println("Dont code");}*/
	 
	 
	
	
	    double num1,num2;
		double result=0.0;
		System.out.println("Enter first number:");
		System.out.println("Enter first number:");
		System.out.println("Select operator:+,-,*,/,%");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		String operator=scan.next();
		
	switch(operator) {
	    case"+":
			  result=num1+num2;
			 break;
	    case "-":
			 result=num1-num2;
			 break;
		
	    case "*":
			 result=num1*num2;
			break;
		 
	    case"/":
			 result=num1/num2;
			 break;
			 
	    case"%":
			 result=num1%num2;
		     break;
		     default:
			 System.out.println("Invalid operator selected: "+ operator);
			 break;
		      }
	   System.out.println("Result:"+result);
		 
			//////////////////////////////////////////////////
	
	
	char grade='B';
	switch(grade) {
	case 'A':
	case 'B':
	case 'C':
		System.out.println("Pass");
		break;
	case 'D':
	case 'E':
		System.out.println("Fail");
		break;
	default:
		System.out.println("Invalid grade");
	
	}
	
	
	
	
	
	
	
	
	}
}
