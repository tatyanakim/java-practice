package day32_Methods;

public class WarmUpCooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//a method calls other Methods
		
	makePancakes();
	makePasta();
	      //dish                 ingredients
	cook("Pancakes","Eggs,Salt,Tomatoes,Green Peppers,Onions");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~~"+ dish.toUpperCase()+" RECIPE ");
		add(ingredients);
		System.out.println("Cook it");
		System.out.println("~~~"+dish .toUpperCase()+ " IS READY!~~");
		//we could also check value of dish and call matching methods
		if (dish.contentEquals("pancakes")) {
			makePancakes();
		}
		
	}
	public static void makePasta() {
		System.out.println("-ITALIAN PASTA RECIPE-");
		add("Water,Salt,EVOO");
		boil(2);
		add("Spagetti");
		boil(9);
		mix(60);
		add("Paresan cheese, Marinara");
		System.out.println("ENJOY YOUR PASTA");
		
	}
	
	public static void makePancakes() {
		System.out.println(" -Pancakes recipe-: ");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("-Enjoy your pancake-");
		
	}
	
	public static void add(String ing) {
		System.out.println("Add " +ing );
	}
	public static void mix(int seconds) {
	System.out.println("Mix for "+seconds+ " seconds");	
	
	
}
	public static void fry(int minutes) {
		System.out.println("Fry for "+minutes+" minutes");
	}
	
	public static void boil(int minutes) {
		System.out.println("Boil for: "+minutes+" minutes");
	}
	
	
	
	

}
