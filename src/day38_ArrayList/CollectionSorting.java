package day38_ArrayList;
import java.util.*;
public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List <Integer> numslist=new ArrayList<>();
	numslist.add(44);
	numslist.add(1);
	numslist.add(5);
	numslist.add(90);
	System.out.println(numslist);
	
	System.out.println("Sorting.. please wait....");
	
	Collections.sort(numslist);
	System.out.println(numslist);
	
	
	
	List<String> strlist=new ArrayList<>();
	strlist.add("Fuad");
	strlist.add("Roman");
	strlist.add("Murad");
	strlist.add("Bojan");
	strlist.add("Dina");
	strlist.add("Anastasiya");
	System.out.println(strlist);
	System.out.println("Sorting wait.....");
	Collections.sort(strlist);
	System.out.println(strlist);
	
	//max min
	int maxNum=Collections.max(numslist);
	int minNum=Collections.min(numslist);
	
	
	System.out.println(maxNum);
	System.out.println(minNum);
	
	
	
	
	String maxName=Collections.max(strlist);
	String minName=Collections.min(strlist);
	System.out.println(maxName);//by index
	System.out.println(minName);// by index
	
	
	
	//random shuffle
	
	Collections.shuffle(strlist);
	System.out.println(strlist);
	
	
	
	
	
	
	
	}
	

}
