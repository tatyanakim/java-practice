package day51Inheritance;

public class JuiJitsu extends Exercise{
	@Override
	public int perform(int minutes) {
		System.out.println("JuiJitsu");
		return minutes*12;

		}

}
