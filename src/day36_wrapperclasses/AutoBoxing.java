package day36_wrapperclasses;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //AUTOBOXING
		Integer num1=1234;//autoboxing-primitive to object
		int n=5;
		Integer num2=n;//autoboxing
		
		
		
		//Auto-Boxing vs unboxing
		//autoboxing is converting from primitive =>wrapper class object
		
		
		
		
		double d1=33.2;
		Double d2=34.6;
		Double d3=8.5;
		
		
		//Unboxing=object to primitive
		//convert object into primitive
		//convert wrapper class object into primitive
		
		Double di1=new Double(34.6);
		double di2=di1;
		System.out.println(di1);
		System.out.println(di2);
		
		
		
		
		long l1=new Long(60000000);//unboxing
		long l2=new Long(435435454);//no boxing
		long l3=l2;//autoboxing
		long l4=13;//autoboxing
		
		
		Integer num3=Integer.valueOf(3423);
		
		
		
		
	}

}
