package day38_ArrayList;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List<String> list=new ArrayList<>();
	
	list.add("red");
	list.add("blue");
	list.add("white");
	list.add("grey");
	//add method with index :yellw will be placed to index 0
	list.add("black");
	list.add(0,"yellow");
	
	//toString method to print all values in the same line
	System.out.println(list.toString());
	//size method 
	System.out.println("Number of the elements: "+list.size());
	//get method return value from index
	System.out.println("0: "+list.get(3));
	System.out.println("3: "+list.get(0));
	
	//remove using index removes value from the index positions
	list.remove(0);//removes yellow
	System.out.println(list);
	
	//remove using value/element removes element first occurence
	list.remove("blue");//removes blue
	System.out.println(list);
	
	
	
	//set(index,value) replace index with the new value
	list.set(0, "orange");
	System.out.println(list);//replaced red with orange
	
	//indexOf (value).returns index of value in the list 
	System.out.println("grey: "+list.indexOf("grey"));
	System.out.println("green: "+list.indexOf("green"));
	
	//isEmpty()returns true if list is empty. size==0
	System.out.println(("is list is empty?"+ list.isEmpty()));
	System.out.println(("Is list is empty?"+ (list.size()==0)));
	
	//contains(elem)==returns true if value is present
	System.out.println("white in the list? "+list.contains("white"));
	
	
	List <String> list2=new ArrayList<>();
	
	//addAll-adds all values from one list into another
	list2.addAll(list);
	System.out.println(list2);
	
	//contains all.check if list has all values of another list
	System.out.println("contains all"+list.containsAll(list2));
	
	//equals (list) checks if  2 lists are exactly the same 
	System.out.println("equals: "+list.equals(list2));
	
	list2.add("pink");
	
	System.out.println(list2);
	
	//removeall(list) removes all matching values from one list from another
	list2.removeAll(list);
	
	System.out.println(list2+"=after removeAll");
	
	
	//addall (index,list) adds new list values starting from given index
	
	list2.addAll(0,list);
	System.out.println(list2);
	
	
	list.clear();
	list2.clear();
	System.out.println("both empty?= "+(list.isEmpty()&&list2.isEmpty()));
	
	
	
	
	}

}
