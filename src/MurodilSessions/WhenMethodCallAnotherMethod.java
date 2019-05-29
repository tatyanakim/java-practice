package MurodilSessions;

public class WhenMethodCallAnotherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(milesToKms(10));
	System.out.println(milesToKms(70));
	double km=milesToKms(45);
	System.out.println(km);
	System.out.println(multiply(4,8));
	
	
	
	
	
	}
	public static double milesToKms(double miles) {
		//double kmValue=miles*1.609;
		double kmValue=multiply(miles,1.609);
		return kmValue;
	
	
	
	
	
	
	}
	
	
	public static double multiply(double n1, double n2)
	{
		return n1*n2;
	}

}
