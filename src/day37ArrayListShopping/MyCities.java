package day37ArrayListShopping;
import java.util.ArrayList;
public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 ArrayList <String>  cities=new ArrayList<>();
	 
	cities.add("Miami");
	cities.add("Barnaul");
	cities.add("Sterling");
	cities.add("Tashkent");
	cities.add("Baku");

	
	//print each city with space
	for(int i=0;i<cities.size();i++) {
		System.out.print(cities.get(i)+" ");
	}
	System.out.println();
	for( String city: cities) {
		System.out.print(city+" ");
	}
	System.out.println();
	//remove Baku
	cities.remove("Baku");
	System.out.println(cities);
	System.out.println(cities.remove("New York"));//false
	

	
	
	// isEmpty
	
	System.out.println("Is list empty? "+cities.isEmpty());
	cities.add(0,"Bishkek");//add to ArraysList
	System.out.println(cities);
	cities.add(1,"Nursultan");
	System.out.println(cities);
	
	
   cities.set(2, "Seoul") ; //
   System.out.println(cities);
   int idx=cities.indexOf("Sterling");
   System.out.println(idx);
   cities.set(idx, "Zagreb");
   System.out.println(cities);
  // cities.clear();
   boolean empty=cities.isEmpty();//checks if its empty
   System.out.println(empty);
   System.out.println(cities);
   
   cities.add(0,"Pit");
   System.out.println(cities); 
   
   
   
   
   
   
   
   
	}

}
