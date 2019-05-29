package day37ArrayListShopping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List <String> cars =new ArrayList<>();
	
	cars.add("Honda");//add more values
	//daclare and add values in single statement
	//Arrays.class
	List <Integer> nums=Arrays.asList(6,7,9,4,5);//fixed size
	System.out.println(nums.size());
	
	System.out.println(nums);
	
	
	
	
	
	//create arraylist prices
	//assign 10 values using Arrays.aslist method 
	
	
	List<Double> prices=Arrays.asList(12.3,45.6,4533.6,12.0,65.6,8.0,4544.0);
	System.out.println(prices);
	double sum=0.0;
	for(double s:prices) {
		sum+=s;
	}	
	System.out.println("sum: $"+sum);
	
	
	
	
	
	double sum2=0.0;
	
	for(int i=0;i<prices.size();i++) {
		sum2+=prices.get(i);
		
	}System.out.println("sum2: "+sum2);
	
	
	//create new list expensive
	//add prices that more than 100 
	
	ArrayList<Double> morethan100=new ArrayList<>();
	for(int k=0;k<prices.size();k++) {
		if(prices.get(k)>=100) {
		       morethan100.add(prices.get(k));
		       
		}System.out.println(morethan100);
	}
	
	
	
	
	
	
	
	}

}
