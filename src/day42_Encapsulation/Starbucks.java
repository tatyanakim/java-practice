package day42_Encapsulation;

public class Starbucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WarmUpCoffee cof1=new WarmUpCoffee();
	cof1.type="iced caramel macchiato";
	cof1.cal=180;
	cof1.price=4.75;
	cof1.size="grande";
	
	cof1.getCoffeeInfo();
	
	
	
	WarmUpCoffee cof2=new WarmUpCoffee();
	cof2.setType("Java chip");
	cof2.size="Venti";
	cof2.price=5.95;
	cof2.cal=600;
	cof2.getCoffeeInfo();
	
	
	
	WarmUpCoffee cof3=new WarmUpCoffee();
	cof3.setType("Rasberry mocha");
	cof3.setSize("SMall");
	cof3.setCal(360);
	cof3.setPrice(6.75);
	cof3.getCoffeeInfo();
	
	
	System.out.println("coffee3 "+cof3.type);
	
	WarmUpCoffee cof4=new WarmUpCoffee();
	cof4.setCofInfo("Flat white","tall",3.95,170);
	cof4.getCoffeeInfo();
	}

}
