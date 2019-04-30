package VAsiliySessions;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Find min numbers
	
	int[] numbers= {421,235,435,64,54,63,54,845,4};
	double[]doubleNumbers= {32.45,32.5,567.7,341.6};
	findMin(numbers);
	System.out.println(findMin(numbers));
	double m=findMin2(doubleNumbers);
	System.out.println(m);
	
	
	
	
	
	
	
	
	
	
	}
	public static double findMin2(double[] arr) {
		double min=arr[0];
		for(double i:arr) {
			if(i<min) {
				min=i;
				
			}
		}
	return(min);
	}


public static int findMin(int[] arr2) {
	int min=arr2[0];
	for(int i:arr2) {
		if(i<min) {
			min=i;
			
		}
	}
return(min);
}

}