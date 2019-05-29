package day50_Encapsulation_Inheritance;

public class AppsFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	IphoneApp iApp1=new IphoneApp();
	IphoneApp iApp2=new IphoneApp("Uber");
	
	
	AndroidApp  adnApp1=new AndroidApp();
	AndroidApp  andApp2=new AndroidApp("Lyft");
	
	
	System.out.println(iApp1.getName());
	System.out.println(iApp2.getName());
	
	System.out.println(andApp2.getName());
	System.out.println(adnApp1.getName());
	
	
	
	App.count=33;
	System.out.println(IphoneApp.count);
	AndroidApp.count=100;
	
	//static all shared
	//static method cant call non static variables or methods
	//
	System.out.println("App count: "+App.count);
	System.out.println("IphoneApp.count "+IphoneApp.count);
	System.out.println("AndroidApp count: "+AndroidApp.count);
	
	
	App.build("Swift");
	IphoneApp.build("Objective C");
	AndroidApp.build("Java");
	
	
	
	
	
	
	
	
	
	
	
	}

}
