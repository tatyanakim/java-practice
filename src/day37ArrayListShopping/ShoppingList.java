package day37ArrayListShopping;
import java.util.ArrayList;
public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList <String> items=new ArrayList<>();
	items.add("hat");
	items.add("watch");
	items.add("bag");
	items.add("jeans");
	items.add("pants");
	
	int count=items.size();
	System.out.println(count);
	System.out.println(items);
	
	
	System.out.println(items.get(0));
	System.out.println((items.get(count-1)));//napechatai poslednie
	
	System.out.println(items.remove(0));//ubrat
	System.out.println(items.size());//idx
	
	System.out.println(items);
	
	
	//for each loop can be used only for reading you  cannot modify list inside for each loop
	for(String i:items) {
		System.out.println(i);
		
		//remove all items at ones 
		items.clear();
		System.out.println(items.toString());
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	}

}
