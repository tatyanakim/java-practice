package day50_Encapsulation_Inheritance;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Animal an =new Animal();
		Cat cat=new Cat();
		Dog dog =new Dog();
		Duck duck =new Duck();
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
	
		
		an.move(20);
	  cat.move(201);
	   dog.move(204);
	 duck.move(300);
	
	
	
	}

}
