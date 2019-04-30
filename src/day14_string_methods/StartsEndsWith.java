package day14_string_methods;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String word1="eclipse";
	System.out.println(word1.startsWith("e"));
	
	System.out.println(word1.startsWith("ec"));
	System.out.println(word1.startsWith("eclipse"));
	
	//false
	
	System.out.println(word1.startsWith("Ec"));
	
	//true
	
	System.out.println(word1.endsWith("e"));
	System.out.println(word1.endsWith("ipse"));
	
	System.out.println(word1.toUpperCase().endsWith("PSE"));
	
	
	
	
	String name ="Mr.Jackson";
	if(name.startsWith("Mr.")) {
		System.out.println("man");
	}else if(name.startsWith("Mrs.")) {
		System.out.println("Married woman");
	}else if(name.startsWith("Ms.")) {
		System.out.println("Some woman");
	}else if(name.startsWith("Dr.")) {
		System.out.println("Doctor man or woman");
	}else {
		System.out.println("Unknown status");
		
	}
	
	
	
	
	
	
	
	
	
	}

}
