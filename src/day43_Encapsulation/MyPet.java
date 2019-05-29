package day43_Encapsulation;

public class MyPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Pet pet1=new Pet("Dog"," Poohchi");
	Pet pet2=new Pet("Cat"," Risya");
	Pet pet3=new Pet("Fish"," Nemo");
	Pet pet4=new Pet("Goat"," Kozlik");
	Pet pet5=new Pet("Bird"," Mina");
	
	
	pet1.speak();
	pet2.speak();
	pet3.speak();
	pet4.speak();
	pet5.speak();
	
	System.out.println(pet1.toString());
	System.out.println(pet2.toString());
	System.out.println(pet3.toString());
	System.out.println(pet4.toString());
	System.out.println(pet5.toString());
	
	}

}
