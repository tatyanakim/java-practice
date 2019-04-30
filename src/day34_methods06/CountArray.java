package day34_methods06;

public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr= {2,4,3,2,2,20};
    int value=2;
    
	System.out.println(findOccurences(arr,value));
	if(findOccurences(arr,value)>0) {
		System.out.println("We have twos");
	}else {
		System.out.println("no twos");
	
		
	}
	          //create an array and pass it to the method
	
			int twenty=findOccurences(new int[] {10,20,20,30,55,22}, 20);
			System.out.println("twenty: " + twenty);
			

	}
	
	
	
	
	
	
	
	
	
	
	
	public static int findOccurences (int[] arr,int value) {
		int count=0;
	 for(int i=0;i<arr.length;i++) {
		 
		 if(arr[i]==value) {
			 count++;
		 }
	 }
		return count;
	}

}
