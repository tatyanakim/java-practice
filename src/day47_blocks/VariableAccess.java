package day47_blocks;

public class VariableAccess {

	
	
	//instance variBLE 
		int myInstanceVar=40;
	
	
	
	//static variable 
		static int myStaticVariable=55;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		//cannot access non static from static method
	//System.out.println(myInstanceVar);
	System.out.println(myStaticVariable);
	
	//create object of Variable and print myInstanvceVAr
	VariableAccess v=new VariableAccess();
	System.out.println(v.myInstanceVar);
	
	//access static variable using the object
	System.out.println(v.myStaticVariable);
	
	//access static varianble using classname
		System.out.println(VariableAccess.myStaticVariable);
		
		
		
		}

}
