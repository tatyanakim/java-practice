package day38_ArrayList;
import java.util.*;
public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List<String> l1=new ArrayList<>();
	
	l1.add("java");
	l1.add("python");
	
	List<String> l2=new ArrayList<>();
	l2.add("C#");
	l2.add("C++");
	System.out.println(l1);
	System.out.println(l2);
	
	for(String value:l1) {
		l2.add(value);
	
	}System.out.println(l2);
	

	l1.addAll(l2);
	System.out.println(l1);
	
	
	l2.removeAll(l1);
	System.out.println(l2);
	
	
	
	
	
	
	
	
	
	
	
	
	}















}