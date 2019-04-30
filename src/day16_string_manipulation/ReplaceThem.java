package day16_string_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*  String sentence="Coding is fun,it is my job!";
	   String withNoSpaces=sentence.replace(" ", "");
	   System.out.println(withNoSpaces);
	
	   System.out.println(sentence.replace(",", "!!!"));
	
	
	String mixed="$%^^&&&^*-ja*^^^va";
	mixed=mixed.replace("$%^^&&&^*-","").replace("*^^^","");
	System.out.println(mixed);*/

	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	String result="About 115,000,000 results(0.59 seconds)";
	
	result=result.replace("About ", "");
	
	result=result.substring(0, result.indexOf(" "));
	
	System.out.println(result);
	
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	
	String str="Moscow is a capital of Russia";
	str=str.replace("Moscow","Baku").replace("Russia" ,"Azerbaidjan");
	System.out.println(str);
	
	
	String email="firstname_Lastname@gmail.com";
	String company="apple";
	String newmail=email.replace("gmail", "apple");
	System.out.println(newmail);
	}

}
