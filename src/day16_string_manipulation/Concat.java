package day16_string_manipulation;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String word="java";
	System.out.println(word.concat("+selenium"));
	System.out.println(word.concat("+Eclipse"));
	
	
	word=word+"-Cucumber";
	System.out.println(word);
	
	
	
	word=word+123;
	System.out.println(word);
	
	
	String word2="Hi";
	word2=word2.concat("-hey").concat("-how are you").concat("-good");
	System.out.println(word2);
	
	
	
	}

}
