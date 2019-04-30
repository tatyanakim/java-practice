package day06_operators2;

public class ShortHandOperators {
	public static void main(String[]args) {
		int students = 45;
		students=students+5;
		System.out.println("Students: "+students);
		students= students-2;
		System.out.println("Students: "+students);
		
		int teacher=10;
		teacher+=2;
		System.out.println("Teachers: "+teacher );
		teacher-=5;
		System.out.println(teacher);
		teacher+=10;
		System.out.println(teacher);
		
		
		
		
		int cars=12;
		cars =cars*2;
		cars *= 2;
		cars+=cars;
		System.out.println(cars);
		
		int shoes=20;
		shoes/=5;// shoes= shoes/5
		System.out.println(shoes);
		
		
		double price=45.50;
		double amount= 5;
		price+=amount;
		System.out.println(price);
		
		
		
		int minutes=66;
		//minutes= minutes%60
		minutes %= 60;
		System.out.println(minutes);
		
		
		int pennies = 550;
		pennies %= 100;//pennies=pennies%100
		System.out.println(pennies);
		
		
		int count = 1;
		count = count+1;
		count += 1;
		count++;
		System.out.println(count);
		
		
		
		
		
		
	}

}
