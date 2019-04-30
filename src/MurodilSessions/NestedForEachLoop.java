package MurodilSessions;

public class NestedForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] arr1= {1,5,78};
	
	int[] arr2= {20,5,22,4,7};
	
	
//check if all ites in arr1 present in arr2
	boolean containsAll=true;
	//nested for each
	for(int n1:arr1) {//2
		System.out.println("Outer: "+n1);
		int count=0;
		
		for(int n2:arr2) {
			System.out.println("Inner: "+n2);
			if(n2==n1) {
				System.out.println("Found! "+n1+" is in Arr2");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Not found !"+n1+" is not in Arr2");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
