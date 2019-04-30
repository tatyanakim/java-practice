package day23KeepPracticing;




public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[3];// Array Syntaxis

		int num1 = 5;
		int num2 = 7;
		int num3 = 10;

		// assign to the first variable value num1

		num[0] = num1;
		num[1] = num2;
		num[2] = num3;

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		String[] names = new String[5];
		String[] names2 = { "Java", "Jav", "Mava", "Ava", "Jva" };
		System.out.println(names2[4]);
		System.out.println(names2.length);
		
		
		

	}

}
