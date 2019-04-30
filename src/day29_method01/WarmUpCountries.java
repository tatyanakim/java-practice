package day29_method01;

import java.util.Arrays;

public class WarmUpCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    
	String[][] countries= {{ "USA","Washington" },
	              {"Canada","Ottawa"},
	              {"Mexico","Mexico city"},
	              {"Brasil","Brasilia"},
	              {"Peru","Lima"},
	              {"Argentina","Boanes Aeros"},
	              {"Bolivia","La Paz"},
	              {"Macedonia","Scopia"},
	              {"Kazakhstan","Nursultan"}
	              };
	//print usa and its capital   
	                   // array#              index#
	System.out.println( countries[0][0]+"|"+countries[0][1]);
	System.out.println(countries[8][0]+"|"+countries[8][1]);
	//print everything
	System.out.println(Arrays.deepToString(countries));
	
	//for each     i
	for(String[] country:countries) {
		                   //  i
		System.out.println(country[0]);
	}
	//for loop
	for(int i=0;i<countries.length;i++) {
		System.out.print( countries[i][0]+"|");
	}
	
	
	
	System.out.println();
	
	// print cities in separate Array 
	int count=0;
	 String[]cities=new String[countries.length];
	 
	for(int n=0;n<countries.length;n++) {
		cities[n]=countries[n][1];
	}System.out.println(Arrays.toString(cities));
	
	
	
	
	
	
	System.out.println("*************************************");
	//Look for Bolivia make sure city is la paz
	
	//my version
	for( String[] lapaz:countries) {
		if( lapaz[0].contains("Bolivia")) {
			if(lapaz[1].contains("La Paz")) {
				System.out.println(lapaz[1]+" is capital of Bolivia");
			}
			
		}
	}
	//Murodils 
	for (int row = 0; row < countries.length; row++) {
		
		if(countries[row][0].equals("Bolivia")) {
			//System.out.println(countriesArray[row][1]);
			if(countries[row][1].equals("La Paz")) {
				System.out.println("Bolivia test passed");
			}else {
				System.out.println("Bolivia test failed");
			}
			break; // exit the loop.
		
	
	
	
	
	
	
	
	
	
	
	
		}
	
		}
	
	}

}
