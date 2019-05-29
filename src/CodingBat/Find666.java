package CodingBat;
import java.util.Arrays;
public class Find666 {
public static void main(String[] args) {

	int[]ar= {3,6,6,7};

	int c=0;
	String nums=Arrays.toString(ar);
     nums=nums.replace(",", "").replace(" ", "");
     if(nums.contains("66")) {
    	 c++;
     }
    	if(nums.contains("67")) {
    	 c++;
     }
System.out.println(c);




String str="xabxxxcd";
if(!str.startsWith("x")&&!str.endsWith("x")) {
	str=str.replace("x", "");
	
}else if(str.startsWith("x")&&str.endsWith("x")) {
	str=str.substring(0,1)+""+str.replace("x", "")+""+str.substring(str.length()-1);
}System.out.println(str);



String a="";
String b="";

String s="";
if(a.length()==0||b.length()==0) {
	
	s="@@";
}
else if(a.length()>0&&b.length()>0) {
	s=a.charAt(0)+""+b.charAt(b.length()-1);
}else if(a.length()!=0||b.length()==0) {
	
	b="@@";
    s=a.charAt(0)+""+b.charAt(b.length()-1);
}else if(a.length()==0||b.length()!=0) {
	
	a="@@";
    s=a.charAt(0)+""+b.charAt(b.length()-1);
}
	
System.out.println(s);



String str2="code";
String temp="";
for (int i=0;i<str2.length();i++){
temp+=str.charAt(i);
}System.out.println();


//!!!!

 boolean myBool=false;
int yourInt=10;
float hisFloat=19.54f;
System.out.println(hisFloat=yourInt);
System.out.println(yourInt>10);
System.out.println(myBool=false);



String str1="code";
String t="";
for (int k=0;k<str1.length();k++) {
		t+=str1.charAt(k);
System.out.println(t);
}




String word="java";
String stri=word.substring(0,1);
char l;
for(int p=0;p<word.length();p++) {
	l=word.charAt(p);
	if(word.charAt(p)!=l) {
		stri+=word.charAt(p);
		
	}


}System.out.println(stri);
}

}

























