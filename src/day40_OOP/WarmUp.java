package day40_OOP;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		 ArrayList<String> myList = new ArrayList<>();
	        myList.add("Moon");
	        myList.add("Sun");
	        myList.add("Mars");
	        myList.add("Saturn");
	        myList.add("Venus");
	        myList.add("Earth");
	        myList.add("Sun");
	        myList.add("Pluto");
	        myList.add("Mercury");
	        myList.add("Neptune");
	        myList.add("Sun");
	        myList.add("Sun");
	        String targetWord = "Sun";
	        int count = countOccurances(myList, targetWord);
	        if(count == 3) {
	            System.out.println("Unit test PASS: Count is 3.");
	        }else {
	            System.out.println("Unit Test FAIL: Count is " + count);
	            System.out.println("Expected: 3");
	            System.out.println("Actual: "+count);
	        }
	        
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	










//how many times word appears in the list and returns count
public static int countOccurances(ArrayList<String> list,String word) {
	int count=0;
	for (int i=0;i<list.size();i++) {
		if(list.get(i).equals(word)) {
			count++;
		}
	}return count;

    //#2
	/*for(String str:list) {
		if(str.contentEquals(word)) {
			count++;
		}
	}return count;*/




}

}
