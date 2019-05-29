package day49_2Inheritance02;

public class Leopard extends Animal{




public Leopard() {
	super();
	System.out.println("Leopard constructor");
	setType("Leopard");//calling setter from animal class
}


public Leopard(String type) {
	
	super(type);//call animal string type consrtructor
	System.out.println("Leopard one -arg constructor");
}

}
