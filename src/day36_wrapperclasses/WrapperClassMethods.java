package day36_wrapperclasses;

public class WrapperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	
	
	System.out.println(Short.MIN_VALUE);
	System.out.println(Short.MAX_VALUE);
	
	System.out.println(Long.MIN_VALUE);
	System.out.println(Long.MAX_VALUE);
	
	System.out.println(Float.MIN_VALUE);
	System.out.println(Float.MAX_VALUE);
	
	System.out.println(Double.MIN_VALUE);
	System.out.println(Double.MAX_VALUE);
	
	
	
	
	
	
	
	
	
	int count=Integer.parseInt("56588");
	System.out.println(count);
	
	int count2=Integer.valueOf("88898");
	System.out.println(count2);//unboxing
	
	
	
	//
	
	
	
	System.out.println(Character.isAlphabetic('@'));//return true or false
	System.out.println(Character.isLetter('j'));
	System.out.println(Character.isDigit('5'));
	String str ="java101";
	System.out.println(Character.isAlphabetic(str.charAt(0)));
	System.out.println(Character.isDigit(str.charAt(6)));
	
	
	String w="ab123c5dfer1";
	String n="";
	for(int i=0;i<w.length();i++) {
		if(Character.isDigit(w.charAt(i))) {
			System.out.print(w.charAt(i));
		}
		
	}System.out.println();
	for(int i=0;i<w.length();i++) {
		if(Character.isAlphabetic(w.charAt(i))) {
			System.out.print(w.charAt(i));
		
	
		
	}
	
	
		}
	}

	}
