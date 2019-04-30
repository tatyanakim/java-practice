package day27_Arrays05;

import java.util.Arrays;

public class CopyOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // copyOf
    //Stack         //Heap
    double[]d1= {2.3,4.5,12.4};
	double[] d2=d1;
	
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	
	d1[0]=1000.3;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	
	 d2[1]=200;
	 System.out.println(Arrays.toString(d1));
	 System.out.println(Arrays.toString(d2));
		
	
	double []d3=Arrays.copyOf(d2, d2.length);//copy from d2, everything its a independent array not affecting others
	System.out.println(Arrays.toString(d3));
	d3[0]=7000;
	System.out.println(Arrays.toString(d3));
	}

}
