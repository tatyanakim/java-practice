package day25_Arrays;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] population= {5000000,60000000*2,4000078,5677777,7899999};
			
	
       System.out.println("City 0 population: "+population[0]);
       System.out.println("City 1 population: "+population[1]);
       System.out.println("City 2 population: "+population[2]);
       System.out.println("City 3 population: "+population[3]);
       System.out.println("City 4 population: "+population[4]);
       
	    
       String str="abc";// 3
	
	System.out.println("City population: "+population[str.length()]);//index 3
	
	 
	

	String[] cities= {"Miami","London","Tokio","Rome","New York"};
	 System.out.println("Population of: "+ cities[0]+population[0]);
     System.out.println("Population of: "+ cities[1]+population[1]);
     System.out.println("Population of: "+ cities[2]+population[2]);
     System.out.println("Population of: "+ cities[3]+population[3]);
     System.out.println("Population of: "+ cities[4]+population[4]);
     
	
	
	}

}
