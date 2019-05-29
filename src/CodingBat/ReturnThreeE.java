package CodingBat;

public class ReturnThreeE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//done
	String str="Heeeeello";
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='e') {
			count++;
		}
	}if(count>=1&&count<=3) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	
	
	
	//Warmup-1 >front back
	String s="a";
	String t="";
	if(s.length()>1) {
	t=s.charAt(s.length()-1)+""+s.substring(1,s.length()-1)+s.charAt(0);
	System.out.println(t);
	
	}else {
		System.out.println(s);
	}
	
	
	
	
	
	
	}

}
