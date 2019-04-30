package day24_arrays;

public class SplitSentencePositionOfTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
		String[] words = sentence.split(" ");// method to split  sentence into words 
		for (String str : words) {
			if (str.contentEquals("language")) {
				break;
			}
			count++;
		}
		System.out.println("Position: " + count);

		System.out.println(words[count]);

	}

}
