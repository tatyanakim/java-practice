package day35_JavaPractice;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";//encrypted version of alphabet
		String word="easter";
		
		
		
		
		
		//get a char from word
		//find indexOf the char in Alphabet
		//read the char from encrypted at that index
		//add to some String
		char first=word.charAt(0);//'e'
		int position=alphabet.indexOf(first);
		System.out.println("position: "+position);
		char enChar=encrypted.charAt(position);
		System.out.println(first+"--> "+enChar);
		
		
		//with the loop
		String encryptedWord="";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);//read word by char
			//find  in alphabet
			int idx=alphabet.indexOf(ch);
			//System.out.print(encrypted.charAt(idx));
			encryptedWord+=encrypted.charAt(idx);
		}
		
		System.out.println(word);
		System.out.println(encryptedWord);
		
	}
			
		
		
		
	}


