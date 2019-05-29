package day51Inheritance;

public class AtTheGym {
public static void  main(String []args) {
	Exercise e=new Exercise();
	Running r=new Running();
	Swimming s=new Swimming ();
	Yoga y=new Yoga ();
	JuiJitsu j=new JuiJitsu();
	Sprint sp= new Sprint ();
	System.out.println(e.perform(30));
	System.out.println(r.perform(40));
	System.out.println(s.perform(45));
	System.out.println(j.perform(55));
	System.out.println(y.perform(65));
	System.out.println(sp.perform(50));
	//when a subclass override a method and the overriden version will be inherited to 
	//other sub classes of its own
	System.out.println("============================");
	Snowboarding sn=new Snowboarding();
	System.out.println(sn.perform(100));
	
	
	
}
}
