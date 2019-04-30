package day33MethodsReturn;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(getHourlyPay(10,10));
	int noPay=getHourlyPay(10,0);
	System.out.println(noPay);
	
	
	}

	//when return statement line runs , code will exit the method at that point and whatever below will not run and be unreachable 
	
	
	public static int getHourlyPay(int hours,int rate) {
		
		if (hours<=0){
			System.out.println("Invalid Hours");
			return 0;//exit the method and return 0
		}if(rate<=0) {
			System.out.println("Invalid rate");
		return 0;
	}
		int totalPay=hours*rate;
		return(totalPay);
	
	
	}
	
	
	
	
	
	
}

	

