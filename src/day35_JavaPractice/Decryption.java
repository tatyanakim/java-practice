package day35_JavaPractice;

public class Decryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		     
				System.out.println(decryptChar('a'));
	            
				 System.out.println(decryptSentence("r olev qzez"));
				 System.out.println(decryptSentence("ovgh tl slnv"));
			      
	
	
	
	}

	//decrypt char
	public static char decryptChar(char ch2) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//encrypted.charAt(alphabet.indexOf(ch));//return char at encrypted
		//or we can do :
		int i=encrypted.indexOf(ch2);
		char decret=alphabet.charAt(i);
		return decret;
		
	}
	//decrypt word
	public static String decryptWord(String enWord) {
		String normal="";
		for(int i=0;i<enWord.length();i++) {
		normal+=decryptChar(enWord.charAt(i));
		
		
		}return normal;
		
	}
	//decrypt sentence
	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
	}
	
	
	
	
	
	
	
	

}
