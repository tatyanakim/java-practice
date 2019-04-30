package day11_logical_operator;//NESTED OPERATOR
import java.util.Scanner;
public class TollCalculatorNestedOperator {
	public static void main(String[] args) {
		
		 int propertyPrice = 0;
	        int numberOfBedrooms, garageSpots;
	        float metroAccessibility, schoolScore, highwayAccessibility;
	        boolean backyard, smoking, garage;
	        String houseType;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("*****************************************");
	        System.out.println("* Welcome to the RealEstate calculator! *");
	        System.out.println("*****************************************");
	        //WRITE YOUR CODE HERE
	      
	            System.out.println("Enter your property type:");
	            houseType = scan.nextLine();
	            
	            if(houseType.equals("Condo")){
	              propertyPrice = 50000;
	              System.out.println("How many bedrooms do you have?");
	              numberOfBedrooms = scan.nextInt();
	              propertyPrice = propertyPrice + (numberOfBedrooms * 30000);
	              System.out.println("Do you have a backyard?");
	              backyard = scan.nextBoolean();
	              if (backyard == true){
	                System.out.println("Backyard is not available for condo!");
	              }
	              System.out.println("Do you have garage?");
	              garage = scan.nextBoolean();
	              if (garage == true){
	                System.out.println("How many spots?");
	                garageSpots = scan.nextInt();
	                if (garageSpots <=10){
	                propertyPrice = propertyPrice + (20000*garageSpots);
	                }else{ 
	                System.out.println("Pardon, it's not a public parking!");
	                }
	                System.out.println("How close is metro station?");
	                metroAccessibility = scan.nextFloat();
	                if (metroAccessibility <= 1){
	                  propertyPrice = propertyPrice + 10000;
	                }else if (metroAccessibility >=1 && metroAccessibility <=3){
	                  propertyPrice = propertyPrice + 5000;
	                }
	                System.out.println("How close is highway?");
	                highwayAccessibility = scan.nextFloat();
	                if (highwayAccessibility <=1){
	                  propertyPrice = propertyPrice + 15000;
	                }else if(highwayAccessibility >= 1 && highwayAccessibility <= 5){
	                  propertyPrice = propertyPrice + 8000;
	                }else if (highwayAccessibility >=5 && highwayAccessibility <=20){
	                  propertyPrice = propertyPrice + 4000;
	                }
	                System.out.println("What's the rating of nearest school?");
	                schoolScore = scan.nextFloat();
	                if (schoolScore <= 10 && schoolScore >=8){
	                  propertyPrice = propertyPrice + 45000;
	                } else if (schoolScore <8 && schoolScore >= 4){
	                  propertyPrice = propertyPrice + 20000;
	                } else{
	                  propertyPrice = propertyPrice + 5000;
	                }
	                System.out.println("Does any of your family members smoking?");
	                smoking = scan.nextBoolean();
	                if (smoking == true){
	                  propertyPrice = propertyPrice - 5000;
	                }
	                
	                
	                
	                
	                
	                System.out.println("Market report has been generated.");
	                System.out.println("Your estimate market price is: " + propertyPrice + "$");
	                
	                
	                
	              }
	            }else if(houseType.equals("Townhouse")){
	              propertyPrice = 75000;
	              System.out.println("How many bedrooms do you have?");
	              numberOfBedrooms = scan.nextInt();
	              propertyPrice = propertyPrice + (numberOfBedrooms * 30000);
	              System.out.println("Do you have a backyard?");
	              backyard = scan.nextBoolean();
	              if (backyard == true){
	                propertyPrice = propertyPrice + 5000;
	              }
	              System.out.println("Do you have garage?");
	              garage = scan.nextBoolean();
	              if (garage == true){
	                System.out.println("How many spots?");
	                garageSpots = scan.nextInt();
	                if (garageSpots <=10){
	                propertyPrice = propertyPrice + (20000*garageSpots);
	                }else{ 
	                System.out.println("Pardon, it's not a public parking!");
	                }
	                System.out.println("How close is metro station?");
	                metroAccessibility = scan.nextFloat();
	                if (metroAccessibility <= 1){
	                  propertyPrice = propertyPrice + 10000;
	                }else if (metroAccessibility >=1 && metroAccessibility <=3){
	                  propertyPrice = propertyPrice + 5000;
	                }
	                System.out.println("How close is highway?");
	                highwayAccessibility = scan.nextFloat();
	                if (highwayAccessibility <=1){
	                  propertyPrice = propertyPrice + 15000;
	                }else if(highwayAccessibility >= 1 && highwayAccessibility <= 5){
	                  propertyPrice = propertyPrice + 8000;
	                }else if (highwayAccessibility >=5 && highwayAccessibility <=20){
	                  propertyPrice = propertyPrice + 4000;
	                }
	                System.out.println("What's the rating of nearest school?");
	                schoolScore = scan.nextFloat();
	                if (schoolScore <= 10 && schoolScore >=8){
	                  propertyPrice = propertyPrice + 45000;
	                } else if (schoolScore <8 && schoolScore >= 4){
	                  propertyPrice = propertyPrice + 20000;
	                } else{
	                  propertyPrice = propertyPrice + 5000;
	                }
	                System.out.println("Does any of your family members smoking?");
	                smoking = scan.nextBoolean();
	                if (smoking == true){
	                  propertyPrice = propertyPrice - 5000;
	                }
	                
	                
	                
	                
	                
	                System.out.println("Market report has been generated.");
	                System.out.println("Your estimate market price is: " + propertyPrice + "$");
	                
	                
	                
	              }
	            }else if(houseType.equals("Single Family Home")){
	              propertyPrice = 95000;
	              System.out.println("How many bedrooms do you have?");
	              numberOfBedrooms = scan.nextInt();
	              propertyPrice = propertyPrice + (numberOfBedrooms * 30000);
	              System.out.println("Do you have a backyard?");
	              backyard = scan.nextBoolean();
	              if (backyard == true){
	                propertyPrice = propertyPrice + 5000;
	              }
	              System.out.println("Do you have garage?");
	              garage = scan.nextBoolean();
	              if (garage == true){
	                System.out.println("How many spots?");
	                garageSpots = scan.nextInt();
	                if (garageSpots <=10){
	                propertyPrice = propertyPrice + (20000*garageSpots);
	                }else{ 
	                System.out.println("Pardon, it's not a public parking!");
	                }
	                System.out.println("How close is metro station?");
	                metroAccessibility = scan.nextFloat();
	                if (metroAccessibility <= 1){
	                  propertyPrice = propertyPrice + 10000;
	                }else if (metroAccessibility >=1 && metroAccessibility <=3){
	                  propertyPrice = propertyPrice + 5000;
	                }
	                System.out.println("How close is highway?");
	                highwayAccessibility = scan.nextFloat();
	                if (highwayAccessibility <=1){
	                  propertyPrice = propertyPrice + 15000;
	                }else if(highwayAccessibility >= 1 && highwayAccessibility <= 5){
	                  propertyPrice = propertyPrice + 8000;
	                }else if (highwayAccessibility >=5 && highwayAccessibility <=20){
	                  propertyPrice = propertyPrice + 4000;
	                }
	                System.out.println("What's the rating of nearest school?");
	                schoolScore = scan.nextFloat();
	                if (schoolScore <= 10 && schoolScore >=8){
	                  propertyPrice = propertyPrice + 45000;
	                } else if (schoolScore <8 && schoolScore >= 4){
	                  propertyPrice = propertyPrice + 20000;
	                } else{
	                  propertyPrice = propertyPrice + 5000;
	                }
	                System.out.println("Does any of your family members smoking?");
	                smoking = scan.nextBoolean();
	                if (smoking == true){
	                  propertyPrice = propertyPrice - 5000;
	                }
	                
	                
	                
	                
	                
	                System.out.println("Market report has been generated.");
	                System.out.println("Your estimate market price is: " + propertyPrice + "$");
	                
	                
	                
	              }
	            }
	            
	            
	            
	            
	            
	          }
	        }
 
	        
	        
	        
	        
	        
	        
	        

	/*        can=new Scanner(System.in);
		System.out.println("Enter carType: ");
		int carType=scan.nextInt();
		System.out.println("Is it rush hour?: y/n ");
		String rushHour=scan.next();
	    double price=0.0;
	    boolean isRushHour=true;
	    
	    if(carType==1) {
	    	if(isRushHour) {
	    		price=30.0;
	    	}else {
	    		price=5.0;
	    	}
	    }
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 else if(carType==2) {
	         if(isRushHour) {
	        	 price= 55.30;
	         }else {
	        	 price=15.99;
	         }
	    	
	   if (rushHour.equalsIgnoreCase("yes")){
		isRushHour=true;
		}else {
		isRushHour=false;
		}
	  
	
*/
	

	
