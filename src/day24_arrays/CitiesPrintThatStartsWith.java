package day24_arrays;

public class CitiesPrintThatStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String[] cities = {"Washington","Kiev","Ottawa","Seol","Istambul","London","Moscow"};
	System.out.println(cities.length);

	for(int i=0;i<cities.length;i++) {
		if (cities[i].startsWith("M")) {
		System.out.println(cities[i]);
		}
	}
	
	
	
	
	
	
	
	
	}

}
