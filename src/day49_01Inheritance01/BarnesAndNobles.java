package day49_01Inheritance01;

public class BarnesAndNobles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Ebook ebook=new Ebook();
	
	ebook.setTitle("Java_8");
	ebook.setAuthor("Savitch");	
	ebook.setPages(1016);
	ebook.setPrice(170);	
	ebook.setSize(5000);	
	ebook.setType("Tech Book");	
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		ebook.readEBook(123);
		
		
		AudioBook abook=new AudioBook();
		abook.setTitle("OCA preparation");
		abook.setAuthor("Jeanne");;
		abook.setNarrator("Marufjon");
		abook.listen();
		
		
		PaperBack pb=new PaperBack();
		pb.setAuthor("Marufjon");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
System.out.println(pb.toString());
	}

}
