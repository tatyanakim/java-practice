package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[]args) {
		//cast double to int
		
		int i = (int)3.4;
		System.out.println(i);
		
		double price =230.50;
		int dollars =(int)price;
		System.out.println(dollars);
		System.out.println(price);
		
		
		//whole numbers
		
	int count=75;
	byte byteCount=(byte)count;
	double doubleCount=(double)count;
	char charCount=(char)count;
	
	System.out.println(byteCount);
	System.out.println(doubleCount);
	System.out.println(charCount);
		
	
	long longValue=345676L;
	int intValue=(int)longValue;
	System.out.println(intValue);
	
	
	int large= 5678;
	short small=(short)large;
	System.out.println(small);
	
	int result=(int)(500.4/2.0);// cast double to int
	System.out.println(result);
	
	
	byte b = 123;
	int i2= b;//here it will automatically casted it will work like that
	
	}

}
