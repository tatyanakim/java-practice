package assignments;
import java.util.*;
public class REplMethodCombineTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> w1=new ArrayList<>();
		w1.add("cat");w1.add("dog");
		

		ArrayList<String> w2=new ArrayList<>();
			w2.add("ya");w2.add("ya");
			
		System.out.println(combineAl(w1,w2));
	
	
	
	
	
	
	
	
	
	
	
	
	}public static ArrayList<String> combineAl (ArrayList<String> wordList1,ArrayList<String >wordList2){
		  ArrayList<String> combined=new ArrayList<>();

		  for(String s:wordList1){
		    combined.add(s);
		   
		  }for(String s2:wordList2){
		    combined.add(s2);
		  }return combined;
		}
	


}