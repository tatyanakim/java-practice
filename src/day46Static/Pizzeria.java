package day46Static;

public class Pizzeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Dinner Mom=new Dinner();
	Dinner kid=new Dinner();
	Dinner Dad=new Dinner();
	
	System.out.println("Total slices :" +Dinner.pizzaSlices);
	
	
	
	Dad.takeASlice();
	kid.takeASlice();
	Mom.takeASlice();
	
	System.out.println("Total slices: "+Dinner.pizzaSlices);
	System.out.println("Total slices: "+Dad.pizzaSlices);
	
	kid.takeASlice(3);
	Dad.takeASlice(2);
	Mom.takeASlice();
	
	System.out.println("Total slices : "+Mom.pizzaSlices);
	System.out.println("Total slices: "+Dinner.pizzaSlices);
	
	
	
	
	
	
	
	
	
	
	
	}

}
