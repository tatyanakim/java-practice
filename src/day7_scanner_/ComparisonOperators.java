package day7_scanner_;

public class ComparisonOperators {
	public static void main(String[]args) {
		
		
		System.out.println(5==5);//boolean true
		System.out.println(50==5);//false 
		
		
		int searchCount=5000;
		System.out.println(searchCount==5000);//true
		int expectedCount=5010;
		System.out.println(searchCount== expectedCount);//false
		
		
		
		int speedLimit=55;
		int currentSpeed=75;
		System.out.println(speedLimit==currentSpeed);
		boolean atLimit=speedLimit==currentSpeed;
		System.out.println(atLimit);
		
		boolean overLimit= currentSpeed>speedLimit;
		System.out.println(overLimit);
		
		boolean underLimit= currentSpeed<speedLimit;
		System.out.println(underLimit);
		
}
}