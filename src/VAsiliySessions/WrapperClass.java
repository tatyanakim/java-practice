package VAsiliySessions;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =10;
        Integer num2 = new Integer(10);
        Integer num3 = new Integer(10);
        //check their equality
        
        System.out.println(num ==num2);  //true
        System.out.println(num2==num3);   //false  because it checks the objects
        System.out.println(num2.intValue()==num3.intValue()); //true
        System.out.println(num2.equals(num3));//true
        
        num2 = num3;
        
        System.out.println(num2==num3);  //true
        
        //how to convert text into number?
        
        //first Version returns actual int primitive
        String age = "25";
        int agenum = Integer.parseInt(age);
        
        if (agenum >21) {
            System.out.println("Adult");
        }else {
            System.out.println("Underage");
        }
        
        
        //second VErsion returns object of Integer class but because of auto unboxing we don't see any difference
        
        int agenum2=Integer.valueOf(age);
        
        if (agenum2 >21) {
            System.out.println("Adult");
        }else {
            System.out.println("Underage");
        }
        
        Integer n = 8;
        
        String text = "Wind: 5 mph";
        
        //if statement to determine if wind is safe
        
        String speed = text.substring(text.indexOf(":") + 2, text.lastIndexOf(" "));
        
        System.out.println(speed);
        
        Integer speed1= Integer.valueOf(speed);
        
        System.out.println(speed1);
        
        if(speed1 >30) {
            System.out.println("You are in danger");
        }else {
            System.out.println("Enjoy the wind");
        }
        
        
        
        int maxForInt=Integer.MAX_VALUE;
        int minForInt=Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(5));
	
	
	
	
	
	
	
	
	
	}

}
