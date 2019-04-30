package day35_JavaPractice;

public class EncryptionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(encryptChar('z'));//zashifrovanost
       System.out.println(encryptChar('m'));
       
       
       String normal="sunday";
       String encrypted=encryptWord(normal);
       System.out.println("normal: "+normal+"\n"+ "encrypted: "+encrypted);
       
      System.out.println(encryptSentence("i love java"));
      System.out.println(encryptSentence("java is fun"));
      
      
    
	}





//encryptChar
	//return type: char
	//param:char
	//takes char and returns encrypted version 
	//encryptChar('a')=>'z'
public static char encryptChar(char ch) {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	//encrypted.charAt(alphabet.indexOf(ch));//return char at encrypted
	//or we can do :
	int i=alphabet.indexOf(ch);
	char ret=encrypted.charAt(i);
	return ret;
	
}





//  word encrypt
public static String encryptWord(String word) {
	String cipered="";
	for(int i=0;i<word.length();i++) {
	cipered+=encryptChar(word.charAt(i));
	
	
	}return cipered;
	
}

/*
 * encryptSentence
 * return type: String
 * param: String sentence
 * Split the sentence by space and call encryptWord and 
 * return encrypted sentence
 * java is fun
 */
public static String encryptSentence(String sentence) {
	String[] wordsArr = sentence.toLowerCase().split(" ");
	String retValue = "";
	for(String word : wordsArr) {
		retValue += encryptWord(word)+" ";
	}
	return retValue.trim();
}
	
	
	
	
	
	
	

   



}
