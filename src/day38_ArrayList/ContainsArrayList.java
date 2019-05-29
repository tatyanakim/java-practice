package day38_ArrayList;
import java.util.*;
public class ContainsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1);
		ArrayList <String> list2=list1;//list1 ,list2 point at the same object
		
		
		ArrayList<String> months= new ArrayList<>(list1);//copy all the values from the list1
		System.out.println(months);
	
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		
		//how to check if Feb is in second position
		System.out.println(months.indexOf("Feb")==1);
        System.out.println(months.get(1).contentEquals("Feb"));
        
        
        
        ArrayList<String> months2=new ArrayList<>(list1);
        System.out.println("Month: "+ months.toString());
        System.out.println("Month2: "+ months2.toString());
        
        //check if months has all values of months 2
        
        System.out.println(months.containsAll(months2));
        
        System.out.println(months.equals(months2));
        
        
        //add one more Jan to months2
        
        months2.add("Jan");
        System.out.println(months.containsAll(months2));//doesnt worry about dublicates
        
        
        
        
        
        
	}

}
