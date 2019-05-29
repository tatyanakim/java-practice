package day42_Encapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Array 
	Burger bur1=new Burger();
	bur1.name="Cowboy";
	
	String[] ings= {"onion crisps", "american cheese","pickles","lettuce","b7 sauce"};
	
	bur1.ingredients=ings;
	System.out.println(bur1.name);
	System.out.println(Arrays.toString(bur1.ingredients));
	
	//print 1 ingredients
	System.out.println(bur1.ingredients[0]);
	
	//print all the ingredients
	for(String ing :bur1.ingredients) {
		System.out.println(ing);
		
	
	
	
	
	
	}
	
	
	
	
	}

}
