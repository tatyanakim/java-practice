package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		
	String word="compu ter";
	//System.out.println(word.length());
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));
	System.out.println(word.charAt(6));
	System.out.println(word.charAt(7));
	System.out.println(word.charAt(8));
	
	
	String word2="Java";
	if(word2.charAt(0)=='J'){
		System.out.println("J is first char");
	}
	String word3="Risya";
	if(word3.charAt(0) ==word3.charAt(4)){
		
	}
	System.out.println("match");
	
	String word4="abcd344444";
	char lastChar=  word4.charAt(word4.length()-1);
	System.out.println("Last char of "+word4+" is "+lastChar);
	
	
	
	
	}

}
