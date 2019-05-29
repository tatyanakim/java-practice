package day36_wrapperclasses;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// declare arraylist
		ArrayList<String> languages=new ArrayList<>();
		
	//add values
		languages.add("Java");
		languages.add("English");
		languages.add("Russian");
		languages.add("Arabic");
		languages.add("Azerbaijani");
		languages.add("Ukrainian");
	
	
	System.out.println("Number of values: "+languages.size());
	languages.add("Turkish");
	System.out.println("Number of values: "+languages.size());
	
	
	//remove java
	languages.remove(0);
	System.out.println(languages);
	
	
	
	
	
	
	
	
	}

}
