package CodingBat;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	

		String s1="abc"; 
		String s2="axc";
	   
		int count=0;
		if(s1.length()>s2.length()) {
		for(int i=0;i<s2.length()-1;i++) {
			
				if(s1.charAt(i)+s1.charAt(i+1)==(s2.charAt(i)+(s2.charAt(i+1)))){
					count++;
				}
			}
		}
		else {
			for(int i=0;i<s1.length()-1;i++) {
				
					if(s1.charAt(i)+s1.charAt(i+1)==(s2.charAt(i)+(s2.charAt(i+1)))){
						count++;
					}
				}
		
		}
	
	System.out.println(count);
	
	
	
	String s="Code";
	String temp="";
	int i=0;

 while(i<s.length()) {
	 temp+=s.charAt(i);
	 i++;
 
	System.out.println(temp);
 }
	
	//
  int[]nums= {1, 9, 90, 3, 4, 9};
  int c=0;
	for(int n:nums) {
		if(n==9&&c<=4) {
		}
		c++;
	}
	
	
	
	
	
	}


}
