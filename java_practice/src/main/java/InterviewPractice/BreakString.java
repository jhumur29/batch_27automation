package InterviewPractice;
//how to break a String?
import java.util.Arrays;

public class BreakString {
	static String country="united states of america";
	public static void main(String[] args) {
		
		String[] pieces=country.split(" ");
		System.out.println(Arrays.toString(pieces));
		
	}

}
