package day47_blocks;

public class AllBlocks {
	int nonStaticInt=10;
	static int staticInt=10;
//init can use both of them
static {
	System.out.println("STATIC BLOCK -i run first and only once");
	staticInt--;
}
{
	System.out.println("INITBLOCK: -I run each time object is created. Before constructor");
	nonStaticInt+=5;
	staticInt+=5;
}


public AllBlocks() {
	System.out.println("CONSTRUCTOR -I run each time oobject is created .after init block");
	nonStaticInt+=3;
	staticInt+=3;
}



}