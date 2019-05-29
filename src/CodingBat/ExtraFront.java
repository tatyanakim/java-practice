package CodingBat;

public class ExtraFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String str="Hello";
	String t="";
	
	for(int i=0;i<=2;i++) {
		if(str.length()>=2) {
			t+=str.substring(0,2);
	
	}else {
		t+=str;
	}
		}
	System.out.println(t);
	
	
	
	
	String s="";
	String word="i";
	if(s.length()<word.length()) {
		System.out.println("empty");
	}
	
	else if(s.startsWith(word)||s.substring(1,word.length()).equals((word.substring(1)))) {
		System.out.println(s.substring(0,word.length()));
	}
	
	
	String a="doc";
	String  b="cat";
	String p="";
	if(a.length()==0) {
	p=b;
	}else if(b.length()==0){
	  p=a;
	}
	else if(a.substring(a.length()-1).equals(b.substring(0,1))) {
		p=a.substring(0,a.length()-1)+b;
	}else if(!a.substring(a.length()-1).equals(b.substring(0,1))) {
		p=a+b;
	}
	System.out.println(p);
	
	
	}

}
