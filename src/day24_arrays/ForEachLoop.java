package day24_arrays;

public class ForEachLoop {// another variation of For loop, Enhanced Loop
	// works only with collections of data(Array,not single variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cities = { "Washington", "Kiev", "Ottawa", "Seol", "Istambul", "London", "Moscow" };
		for (String city : cities) {
			if (city.startsWith("M")) {
				System.out.println(city);
			}
		}

		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}

		String str = "Wooden spoon";

		char[] chars = str.toCharArray(); // this method convert String into array of characters
		for (char c : chars) {
			System.out.print(c);

		}
		
		for (int i = chars.length-1; i >= 0; i--) {
			str+=chars[i];
		}System.out.println(str);
		
		
		
		
		
		char[] chrs=str.toCharArray();
		for(char b: chrs) {
			//System.out.println(chrs);
			if(b=='o') {
				System.out.print("*");
			}else {
				System.out.print(b);
			}
			
			
		}
		
		
		

	}

}
