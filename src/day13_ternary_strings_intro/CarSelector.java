package day13_ternary_strings_intro;
import java.util.Scanner;
public class CarSelector {
	public static void main(String[] args) {
		String carOptions="";
		double averagePrice=0.0;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Which type of car you are interested in 1)2)3)4)5):");
		int carType=scan.nextInt();
		 
		
		switch(carType) {
		case 1:
			averagePrice=33000.0;
			carOptions="American:Ford, Dodge, Tesla, Chevrolet, Lincoln"; 
			break;
		case 2:
			averagePrice=32000.0;
		     carOptions="Japanese:Toyota, Mitsubisi, Honda, Subaru, Mazda" ;
		    break;
		case 3:
			averagePrice=55000.0;
			carOptions="Italian: Alfa Romeo, Ferrari, Lamborghini, Fiat";
			break;
		case 4:
			averagePrice=85000.0;
		    carOptions="German: Bmw, VW, Audi, Mercedes, Porsche";
		    break;
		case 5:
			averagePrice=25000.0;
			carOptions=" Korean: Kia, Hyundai, Daewoo";
		
	    default:
	    	System.out.println("Car type not available");
	    	return;
		}
	System.out.println("You selected"+carOptions+"\n\"Average Price:"+ averagePrice);
	
	
	
	
	
	
	
	}
}
