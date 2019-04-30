package day26;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String words = "java,kava,html,selenium";
		String[] myWords = words.split(",");
		System.out.println("Words count: " + myWords.length);
		System.out.println(Arrays.deepToString(myWords));
		System.out.println(myWords[0]);

	
	  for(String word:myWords) {
		  System.out.println(word);
	  }
	String diceResult="1-20 of 1,461 positions";
	
	 String[] newDice=diceResult.split(" ");
	 System.out.println(newDice.length);
	 System.out.println(Arrays.deepToString(newDice));
	 System.out.println(newDice[0].trim());
	
	
	for(String dice:newDice) {
		System.out.println(dice);
	}
	
	String sentence="I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy";
	String[] happy=sentence.split("happy");
	String[] iSplit=sentence.split("I");
	String[] allWords=sentence.split(" ");
	
	for(String all:allWords) {
		System.out.println(all);
	}
	for(String hap:happy) {
		System.out.println(hap);
	}
	for(String i:iSplit) {
		System.out.println(i);
	}
	
	String word="java";
char[]charsArray=word.toCharArray();
	for(char n:charsArray) {
		System.out.println(n);
	}
	
	
	
	
	
	
	}

}
