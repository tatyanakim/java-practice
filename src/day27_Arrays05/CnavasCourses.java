package day27_Arrays05;

import java.util.Arrays;

public class CnavasCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//147 Java programming
		//204 Mentoring Sessions
		//149 SDLC
		//152 QA Testing
		//144 Team Activity
		//143 Welcome Kit
	
	// split string ,store in Array,take last number and convert to integer
	
	String url="https: //learn.cybertekschool.com/courses/149";

    String[] urlArr=url.split("/");
    System.out.println(urlArr.length);//5
	System.out.println(Arrays.toString(urlArr));
	System.out.println(urlArr[urlArr.length-1]);
	int courseID=Integer.parseInt(urlArr[4]);//get the last item,convert to Int and store in Array//4
	
	
	switch(courseID) {
	case 149:
		System.out.println("Its SDLC");
		break;
	case 204:
		System.out.println("Its Mentoring Sessions");
		break;
	case 152:
		System.out.println("Its QA Testing");
		break;
	case 144:
		System.out.println(" Team Activity");
		break;
	case 143:
		System.out.println("its  Welcome Kit");
		break;
		default:
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
