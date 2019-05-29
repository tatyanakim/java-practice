package CodingBat;

import java.util.Arrays;

public class WarmUp2array {


public static void main(String[] args) {
	

int[] nums= {1, 1, 2, 3, 1};// → true

String n=Arrays.toString(nums);
System.out.println(n);

if(n.contains("1,2,3")) {
	System.out.println(true);
}else {
	System.out.println(false);
}


String str="yak";
String s="";
if(str.length()%2==0) {
for(int i=0;i<str.length();i+=4) {
	s+=str.charAt(i)+""+(str.charAt(i+1));
}
System.out.println(s);
}
else if(str.length()%2!=0&&str.length()>3) {
	for(int i=0;i<str.length()-2;i+=4) {
		s+=str.charAt(i)+""+(str.charAt(i+1));
	}System.out.println(s+""+str.substring(str.length()-1));
}else if (str.length()<=3&&str.length()>=0){
	
	System.out.println(str.substring(0,str.length()-1));
	
}


//front three
String t="";
String st="cacghch";
int m=3;


for(int k=0;k<m;k++) {
	if(st.length()>=3) {
t+=st.substring(0,3);
}

else {
	t+=st;
}




}System.out.println(t);



}





}
