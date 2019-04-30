package day33MethodsReturn;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addVoid(1,2);
		int result=add2(2,3);
		System.out.println("Result: "+result);
		result=add2(10,30);
		System.out.println("Result: "+result);
		System.out.println("Minus result:"+add2(6,3));
		System.out.println("Multiply result:"+multiply(8,2));
		System.out.println("Divide result:"+divide(8,0));
		System.out.println("Minus result: "+minus(8,2));
		
		
		
		}
		
		public static void addVoid(int num1,int num2) {
			int sum=num1+num2;
			System.out.println("Sum: "+sum);
		}
		
		public static int add2(int n1,int n2 ) {
			int sum=n1+n2;
			return sum;
			
			
		}
		public static   double  multiply(double mu,double mu2) {
			double sum2=mu*mu2;
			return sum2;
		}
		
		public static   double  minus(double mi,double mi2) {
			double sum3=mi-mi2;
		return sum3;
		
		
		}public static   double  divide(double di,double di2) {
			if(di2==0) {
				System.out.println("ERROR");
				return 0;
				
			}
			double sum4=di/di2;
		return sum4;
		
		
	
		
	


	}

}
