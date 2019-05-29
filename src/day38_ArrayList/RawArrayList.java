package day38_ArrayList;
import java.util.*;//yellow cuz we didnt use it yet
public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList list=new ArrayList();//raw type=can except anything
	list.add("Saturday");
	list.add("Java day");
	list.add(1000);
	list.add(234.4);
	list.add(true);
	list.add(false);
	
	
	System.out.println(list);//automatically call toString()
	String allValues=list.toString();
	System.out.println(allValues);
	String str=list.get(2).toString();
	System.out.println(str);
	System.out.println(list.get(0));;
	
	//all values are store as raw type  we can also call it
	//as general object type
	
	
	}

}
