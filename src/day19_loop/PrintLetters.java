package day19_loop;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String word="Amazon";
	//int idx=0;
	//System.out.println(word.charAt(idx));
    //	idx++;
   //  System.out.println(word.charAt(idx));
		
	
	
//	while(idx<word.length()) {
	//	System.out.println(word.charAt(idx++));
		
	//}
	int idx=word.length()-1;
	while(idx >=0) {
	System.out.println(word.charAt(idx));
	idx--;
	}
	
	
	
	
	}

}
