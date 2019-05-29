package day36_wrapperclasses;
import java.util.ArrayList;
public class ArraysListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//cerate Arraylist
		
		
		
		
		String[] str=new String[5];//fixed size
		ArrayList<String>names= new ArrayList<>();//no size
		int[] numsArr=new int[5];
		ArrayList<Integer> nums=new ArrayList<>();
		
	//assign values into arraylist
		names.add("Tanya");
		names.add("Vika");
		names.add("Risya");
		
		
		nums.add(3);
		nums.add(8);
	
	
	
	//read from arraylist
		System.out.println(names.get(0));
	System.out.println(names.size());
	
	}

}
