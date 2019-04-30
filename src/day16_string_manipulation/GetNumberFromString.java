package day16_string_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	String sentence="I wrote [236] lines of code today";
	int start=sentence.indexOf('[')+1;
	int end= sentence.indexOf(']');
	String codeCount=sentence.substring(start,end);
	System.out.println(codeCount);
	
	
//	System.out.println(sentence.substring(sentence.indexOf('[')+1)+sentence.substring(sentence.indexOf(']')));
	
	
	/*int count2=Integer.parseInt(codeCount);
	
	if(count2>20) {
		System.out.println("Wrote more than 20 line of code today");
	}else {
		System.out.println("Not enough");
	}
		
	String str="hello";
	//int firstHalf1=str.length()/2;
	System.out.println(str.substring(0,str.length()/2));*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
