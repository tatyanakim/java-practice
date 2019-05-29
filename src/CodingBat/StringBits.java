package CodingBat;

public class StringBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*
	String str="axxbnm";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='x'&&str.charAt(i+1)=='x') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}*/
		
	
	String str ="Heeololeo";
	for(int i=0;i<str.length();i+=2) {
		System.out.println(str.charAt(i));
	}
	
	
	int []nums= {1,9};
	int count=0;
	for(int n:nums) {
		if(n==9) {
			count++;
		}
	}System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}