package CodingBat;
import java.util.Arrays;
public class front11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int[]a= {};
	int[]b= {1};
	int[]c=new int[1];
	int []nums=new int[2];
	if(a.length==0){
    c[0]=b[0];
	}else if(b.length==0){
		c[0]=a[0];
	}else {
		nums[0]=a[0];
		nums[1]=b[0];
	}
	
	System.out.println(Arrays.toString(c));
	
	
	
	
	
	 int co=0;
	  if(a.length==0&&b.length!=0){
		  if(b[0]==1) {
				co++;
			}
	  }else if(b.length==0&&a.length!=0){
		  if(a[0]==1) {
				co++;
			}
	  }
		else if(a.length>0&&b.length>0){
		if(a[0]==1) {
				co++;
		}if(b[0]==1) {
			co++;
		}
		}System.out.println(co);
	
	
	
	
	int[]a1= {1,2};
	int[]b1= {3,4};
	int[]both=new int[4];
	int count=0;
	for(int o=0;o<4;o++) {
		if(o>=a1.length) {
			both[o]=b1[count];
			count++;
		
	}else {
		both[o]=a1[o];
	}
		
	System.out.println(Arrays.toString(both));
	
	
	}

	
	String str="Hi-There";
	String s="";
	for(int j=0;j<str.length();j++) {
		s+=str.charAt(j)+""+str.charAt(j);
	}
	System.out.println(s);
	
	
	
	boolean boo=false;
	int a3=6;
	int b3=12;
	 if(a3==6||b3==6||a3+b3==6||Math.abs(a3-b3)==6){
	boo=true;
	 }else {
		boo=false;
	}
	//System.out.println(boo);
	
	
	boolean boo1=false;
	int num=24;
	if(num%20==1||num%20==2) {
		boo1=true;
	}else {
		boo1=false;
		
	}System.out.println();
	
	}
	
	}
	


