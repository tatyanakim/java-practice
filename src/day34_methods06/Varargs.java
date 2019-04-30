package day34_methods06;

import java.util.Arrays;

public class Varargs {

	public static void main(String...Tanya) {
		// TODO Auto-generated method stub
		
	cook("Burrito Bowl","Rice","Meat","Salsa","Hot sauce");
    cook("Avocado toast","Cilantro","Lime","Toast","Avocado");
    
    
    shoppingList(2000,"Watch","apple","shoes","dress");
	}





public static void cook(String name,String...ings) {
	System.out.println("Food: "+name);
	System.out.println(Arrays.toString(ings));
	
	
	
	
}
public static void shoppingList(int totalPrice,String...items) {
	System.out.println("Total price is: "+totalPrice);
	System.out.println(Arrays.toString(items));
}



 //public static void sumAll(int...nums) {
	//how to call
	//sumAll()
	//sumAll(10);
	//sumAll(2,3,4);
	//can accept array 
	//int[] myNums={2,2,4};
	//sumAll(myNums);}









}
