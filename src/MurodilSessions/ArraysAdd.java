package MurodilSessions;
import java.util.Arrays;
public class ArraysAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//find the sum of two arrays into new array 
	int[] nums1= {10,20,6,8};
	int[] nums2= {5,1,1,4};
	
	
	
	//int
	System.out.println(Arrays.toString(Add2Arrays(nums1, nums2)));
	System.out.println();
	//string
		String []str1= {"cat","dog"};
		String[] str2= {"egg","apple"};
		System.out.println(Arrays.toString(Add2Arrays(str1,str2)));
		System.out.println();
	
	
	
	}

	private static int[] Add2Arrays(int[] nums1, int[] nums2) {
	   int[]  nums3=new int[nums1.length];
		for(int i=0;i<nums1.length;i++) {
			nums3[i]=nums1[i]+nums2[i];
			
		}
		return nums3;
	}
//method overloading
	public static String[] Add2Arrays(String[] str1,String[]str2 ) {
		String[] str3=new String[str1.length];
		for(int k=0;k<str1.length;k++) {
			str3[k]=str1[k]+"-"+str2[k];
		}
	return str3;
}
}
