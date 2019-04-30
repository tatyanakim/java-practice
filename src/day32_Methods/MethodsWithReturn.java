package day32_Methods;

public class MethodsWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//its returning a number(10)
		System.out.println(giveMe10$());
		
		int i=giveMe10$();
		System.out.println("i: "+i);
		System.out.println(giveMeYourName());// print name
		
        String myname=giveMeYourName();
        System.out.println("My name is "+myname);
	}




//this method returns int value

       
public static int giveMe10$ ( ) {
	System.out.println("returning 10 from Method");//1
	return 10;//2
}

public static  String giveMeYourName() {
	return "Tatyana";
}





}
