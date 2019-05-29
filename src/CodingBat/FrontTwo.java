package CodingBat;

public class FrontTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String s="ki";
	String s2="";
	if(s.length()>=2) {
	s2=s.substring(0,2).concat(s).concat(s.substring(0,2));
	System.out.println(s2);
	}
	else {
		s2=s.concat(s).concat(s);
		System.out.println(s2);
	}
	
	
	
	String str="del";
	if(str.length()>3&&str.substring(1,4).equals("del")) {
		str=str.replace("del", "");
			System.out.println(str);
		}
	else {
		System.out.println(str);
	}
	
	//max return
	
	int a=8;
	int b=88;
	
	if(a<b&&a>=10||a<=20&& b>=10||b<=20) {
		System.out.println(b);
	}else if(a<10||a>20&&b<10||b>20) {
		System.out.println(0);
	
	
	
	
	}
	
	
	
	//endUP
	
	String w="hi";
	
	if(w.length()>=3) {
		w=w.substring(0,w.length()-3)+""+w.substring(w.length()-3).toUpperCase();
		System.out.println(w);
	}else {
		w=w.toUpperCase();
		System.out.println(w);
	}
	
	
	
	String word="hi";
	String wo="";
	int n=3;
	 for(int j=0;j<n;j++) {
		 wo+=word;
		 
	 }System.out.println(wo);
	
	
	
	}
	
	
	
	
	
	
	
	}


