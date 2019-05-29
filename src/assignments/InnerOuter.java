package assignments;

public class InnerOuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int[] inner= {6, 5};
	int[] outer= {1, 2, 4};
	
	int count=0;
	
	for(int i=0;i<inner.length;i++) {
		for(int j=0;j<outer.length;j++) {
			if(inner[i]==outer[j]) {
				count++;
				System.out.println(count);
				break;
			}		
			
		}
	}if(count==inner.length) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	
	
	
	}

}
