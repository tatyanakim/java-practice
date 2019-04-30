package day33MethodsReturn;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(calculateAge(0));
	
	
	}






 public static int calculateAge(int year) {
	 
	 int age=2019-year;
	
	 if(age>=1 && age<=14) {
		 System.out.println("child");
		
	 }else if(age>=15&&age<=25) {
		 System.out.println("youngster");
		
	 }else if(age>=26 && age<=64) {
		 System.out.println("adult");
		
	 }else if(age>65) {
		 System.out.println("senior");
		 
	 }else {
		 System.out.println("Invalid age");
		 
	 }
      return age;




 }

}
