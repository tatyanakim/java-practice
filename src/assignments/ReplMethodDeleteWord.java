package assignments;
import java.util.*;
public class ReplMethodDeleteWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> words=new ArrayList<>();
	words.add("hi");words.add("hey");words.add("hi");words.add("Yo");
	String wee="hi";
	System.out.println(words);
	removeAll(words,wee);
	
	
	
	
	
	
	
	
	
	}	public static void removeAll(ArrayList<String> wordList,String targetWord){
		for(int i=0;i<wordList.size();i++) {
			if(wordList.get(i).equals(targetWord)) {
				wordList.remove(wordList.get(i));
			}
		}System.out.println(wordList);
		
	}
}
