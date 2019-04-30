package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {
	public static void main(String[]args) {
		/*Scanner scanner= new Scanner(System.in);//actions for scanner;
		
		System.out.println("What is your name? ");
		
		String name= scanner.nextLine();//accept String input(Line for whole line)
		System.out.println("Nice to meet you, "+name+"!");*/
		



 

    //WRITE YOUR CODE HERE: scanner
		
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter 3 items and its price :");
    String item1=scanner.next();
    double price1=scanner.nextDouble();
   
    String item2=scanner.next();
    double price2=scanner.nextDouble();
    
    String item3=scanner.next();
    double price3=scanner.nextDouble();
    
    double totalPrice= price1+price2+price3;
    String report="Item1: "+item1+" Price "+price1+",Item2: "+item2+", Price "+price2+", Item3 "+item3+", Price "+price3;
    System.out.println(report);
    System.out.println("Total price: "+totalPrice);
    
    






	}
}
