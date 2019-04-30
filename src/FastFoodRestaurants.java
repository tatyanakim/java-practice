import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FastFoodRestaurants {
//new input output
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       //read all data and assign to array
		String[] data= Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	
	System.out.println("Data size: "+data.length);
	
	//print first row
	System.out.println(data[1]);
	System.out.println(data[data.length-1]);
	
	//print all restaurant inforation in state of VA
	for(String line:data) {// same with for each loop
		System.out.println(line);
	}
		
	
	//print with nubers of line
	int counter=0;
		for(String restaurant:data) {
			System.out.println("#"+counter+"=>"+restaurant );
			counter++;
		}
		
	    
		int countVA=0;
	     for(int i=0;i<data.length;i++) {
		if(data[i].contains(",VA,") ){
			countVA++;
		}
	     }System.out.println( "Total restaurants in VA: " +countVA);
	     
	     
	     
	     //print the restaurants names with cityname: Subway- Herndon
	
	     
	    for(String cityPlace:data) {
	    	if(cityPlace.contains(",VA,")) {
	    		String[]tempArr=cityPlace.split(",");
	    	
	    System.out.println(tempArr[2]+"-"+tempArr[1]);
	    } 
	    
		
		    
	}

}
}