package day7_scanner_;

public class EplicitCasting {
	public static void main(String[]args) {
		//from larger into smaller
		
		System.out.println(10/2.0);//double,decimal wins always
		System.out.println(10.0/2);//same
		
		
		int result=(int)(10/2.0);
		System.out.println(result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		 
		double average= (double)((rent1+rent2+rent3+rent4)/4.0);
		
		double average2=(double)(rent1+rent2+rent3+rent4)/4;
		
		System.out.println(average);
		System.out.println(average2);
		
		double d =40.2;
		int i = (byte)d;
		
		
		
		
		
		
		
		
	}
}
