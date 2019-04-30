package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[]args) {
		//automatic casting from smaller to larger type
		
		
	short shortValue=3455;//short is smaller than int .(int)shortValue-optional
	int intValue=shortValue;
	System.out.println(intValue);
	
	double price=345;//(double)345 is optional it casting automatically
	System.out.println(price);
	
	int price1=34563;
	double price2=price1;
	System.out.println(price2);
	
	
	}

}
