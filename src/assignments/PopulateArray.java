package assignments;
import java.util.*;
import java.util.Arrays;

public class PopulateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=5;
	int []arr=new int [n];
	int i=0;
	while(i<=n-1) {
		arr[i]=i+1;
		i++;
	System.out.println(Arrays.toString(arr));
	}
	
	String str="practice";
	
	str=str.substring(str.length()/2-1,str.length()/2+1);
	
	System.out.println(str);
	
	}

}
