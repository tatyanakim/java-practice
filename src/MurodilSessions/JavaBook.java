package MurodilSessions;

public class JavaBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        //012345678  print unique char
		String str = "jjavabook"; //vbk
		//outer loop take one char at a time
		for(int i = 0; i < str.length(); i++) {
			//read one char from str and store to temp
			char temp = str.charAt(i);// j
			//inner loop will compare with other chars
			int count=0;
			for(int j = 0; j < str.length(); j++) {
				//copare each charakter with temp
				if(temp == str.charAt(j) && i != j ) {
					//System.out.println(temp + " is duplicated");
					count++;
					
				}
			}
			//outside inner loop check if count is still 0
			//if count is 0 then tep is unique
			if(count==0) {
				System.out.println(temp);
			}
		}
	
	
	
	
	
	
	}

}
