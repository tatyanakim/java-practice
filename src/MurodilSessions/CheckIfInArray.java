package MurodilSessions;

public class CheckIfInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int n=55;//looking for n inside
	int nums[]= {22,23,55,22,11,90};
	boolean present=false;
	for(int n55:nums) {
	
		if(n55==n) {
			present=true;
			break;
		}
		}System.out.println("its inside -"+present);
		
		
		
		
		
		  //114 non dublicate
		  int[]arr= {1, 1, 2, 3, 4, 3, 4};
		  
		int count2=0;
		
		
		for(int i2=0;i2<arr.length;i2++) {
			for(int j=0;j<arr.length;j++ ) {
				if(arr[i2]==arr[j]) {
					count2++;
					
				}
			}if(count2==1) {
				System.out.println(arr[i2]);
		}
			count2=0;
		}
	
	
	
	//156 find whats repeating print count of repeating done
	
		
		String[] arr1=	{"a","foo","bar","foo","bla"};
	String t="foo";
	
	  int count=0;
	
	for(String rep:arr1) {
		if(rep.equals(t)){
			count++;
		}
	}System.out.println(count);
	
	
	
	
	//153 find a none repeating words
	
	
	
	String []words= {"java", "code"," python", "code", "rust", "code", "rust"};
	
	int c=0;
	for(int x=0;x<words.length;x++) {
		for(int y=0;y<words.length;y++) {
			if(words[x].contentEquals(words[y])) {
				c++;
			}
		}if(c==1) {
			System.out.println(words[x]);
		}
		c=0;
	}
	
	
	}

	}
