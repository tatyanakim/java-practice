package day53_;

public class TestHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	City city=new City(345,"London");
	Capital cap=new Capital(433,"Paris",45645433L);
	
	
	System.out.println(city.count);
	System.out.println(cap.count);
	

	System.out.println(city.toString());
	System.out.println(cap.toString());
	
	cap.displayCount();
	
	city.buildARoad();
	cap.buildARoad();
	
	
	City.buildARoad();
	Capital.buildARoad();
	
	
	
	
	
	City city2=new City(889,"Fairfax");
	Capital cap2=new Capital(545645656,"Richmond",55656565L);
	System.out.println();
	
	
	city2.letsBuildARoad();//inherited
	cap2.letsBuildARoad();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
