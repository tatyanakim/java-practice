package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnDoubleArr {

public static void main(String[]args) {
	ArrayList<Boolean> a=new ArrayList<>();
	a.add(true);
	a.add(false);
    a.add(true);

    repeatAll(a);

    int[] c= {10, 40, 50, 3, 1};
     int[]d= {11, 0, 500, 44, 1101};


   System.out.println(Arrays.toString(addElements(c,d)));


}

public static void repeatAll(ArrayList<Boolean> b) {
ArrayList<Boolean>v=new ArrayList<>();


v.addAll(b);
v.addAll(b);
System.out.println(v);
}

public static int[] addElements(int[] ints1, int[] ints2) {
	int count=0;
	for(int in:ints2)
	{
		ints1[count]+=in;
	count++;
	}
	return ints1;
    
    
    
}



















}
