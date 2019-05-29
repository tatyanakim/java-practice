package day52_Inheritance;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Computer comp1=new Computer("imac","silver");
	Computer comp2=new Computer("imac","silver");
	Computer comp3=comp2;
	
	System.out.println(comp1==comp2);
	System.out.println(comp1.equals(comp2));
	
	System.out.println(comp3==comp2);
	System.out.println(comp3.equals(comp2));
	
	
	
	
	
	}

}
