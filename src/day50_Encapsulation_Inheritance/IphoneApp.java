package day50_Encapsulation_Inheritance;

public class IphoneApp extends App{//has two constructors .one is empty
	//when a parent class has no args constructor.
	//sub-class needs to create its own constructor and call parent 
	//class constructor by using super( args);
	
	//else if parent class has a matching constructor child class will compile
	public IphoneApp(String name){
		super(name);
		
		
	 
		
		
	}
	public IphoneApp() {
	super("Iphone App-unknown");//its a constructor from the parent class
	
	
	}
}