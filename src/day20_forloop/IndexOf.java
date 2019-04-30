package day20_forloop;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String word="amazon";
     char letter='m';
     
    // for(int i=1;i<=10;i++) {
    //	 System.out.println(i);
    //	 if(i==5) {
    //		 break;
    //	 }
    // }
     int index=-1;
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)==letter) {
		index=i;
		break;
		}
		
	}
	System.out.println("Index:"+index);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
