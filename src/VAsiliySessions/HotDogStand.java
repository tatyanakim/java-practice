package VAsiliySessions;

public class HotDogStand {

private int iD;
private int sold;
private static int total;


public HotDogStand(int ID,int sold) {
	this.iD=ID;
	this.sold=sold;
}
//method that returns the number of hot dog sold for every hotdog stand
public int getSold() {
	return this.sold;
}








public void justSold() {
	//sold is for counting sold hotdogs for every hotdog stand individually
	this.sold++;
	//total is for counting sold hotdogs for all hotdog stand individually
	total++;
}

//and static method that returns the value in this variable
public static int getTotal() {
	return total;
}




}
