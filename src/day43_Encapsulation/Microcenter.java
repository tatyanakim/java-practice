package day43_Encapsulation;

public class Microcenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//objects created =calling constructor
	Computer comp1=new Computer();
	Computer comp2=new Computer();
	
	
	System.out.println(comp1.toString());
	System.out.println(comp2.toString());
	
	
	
	comp1.setBrand("iMac");
	comp1.setOs("MAcOs High Sierra");
	comp1.setPrice(2323);
	
	comp2.setBrand("Dell XPS");
	comp2.setOs("Windows 10");
	comp2.setPrice(1300);
	
	System.out.println(comp1.toString());
	System.out.println(comp2.toString());
	
	//use constructor to print out
	Computer comp3=new Computer("Asus","Windows 7",645);
	System.out.println(comp3.toString());
	comp3.setOs("Windows 11");
	System.out.println(comp3.toString());
	
	comp3.setPrice(comp3.getPrice()-200);
	System.out.println(comp3.toString());
	
	}

}
