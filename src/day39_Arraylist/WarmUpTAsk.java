package day39_Arraylist;
import java.util.*;
public class WarmUpTAsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Lima");
        cities.add("Toronto");
        cities.add("London");
        
        
        for(String city:cities) {
        	System.out.print(city+" | ");
        }
        System.out.println();
        
        for(int i=0;i<cities.size();i++) {
        	System.out.print(cities.get(i)+" | ");
        }
        System.out.println();
        
        
        //toString.print each City all uppercase []
        for(int j=0;j<cities.size();j++) {
        	String city=cities.get(j).toUpperCase();
           cities.set(j, city);
        
        } System.out.println(cities.toString());
        
        
        
        //find the longest city and shortest
        
        
           

          
            String l="";
       for(String city2:cities) {
    	   if(city2.length()>l.length()) {
    		   l=city2;
    	   }
       }System.out.println(l+"- LONGEST CITY");
        	
         	
        String sh=cities.get(0);
        for(String city3: cities) {
        	if(city3.length()<sh.length()) {
        		sh=city3;
        	}
        }System.out.println(sh+" -SHORTEST CITY");
        
        //cities length is more than 6 	
       ArrayList<String>moreThan6=new ArrayList<>();
       
       for(String c:cities) {
    	   if(c.length()>6) {
    		   moreThan6.add(c);
    	   }
       }System.out.println(moreThan6);
       
       
       
        }
	}


