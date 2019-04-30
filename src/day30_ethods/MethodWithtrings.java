package day30_ethods;

import java.util.Arrays;

public class MethodWithtrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	countWords("Java is fun");
	googleSearchResult("About 16,600,000 results (0.73 seconds)");
	
	
}

public static void countWords(String sentence) {
	 String[] countWords=sentence.split(" ");
	System.out.println("Number of words: "+countWords.length);
	
	
}

public static void googleSearchResult(String count) {
	String []result=count.split(" ");
	 System.out.println("Count result: " +result[1].replace(",",""));
	 System.out.println("Seconds result: "+result[3].replace("(", ""));
}

}







