package day49_01Inheritance01;

public class Ebook extends Book{
private double size;
private int pages;


public void readEBook(int pageNum) {
	System.out.println("Reading "+getTitle()+" by "+ getAuthor() +" at the page "+ pages);
}


public double getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}












}
