package InterviewPractice;

public class ReplaceNumberAndLetter {
static String text="saro33wer123$#";
	
	//java regular expression or regex
	public static void main(String[] args) {
		String numberOnly=text.replaceAll("\\D", "");//remove all letter and sign
		System.out.println(numberOnly);
		
		String noNumber=text.replaceAll("\\d", "");//remove all number
		System.out.println(noNumber);
		
		String noSign=text.replaceAll("\\W", "");//remove all sign
		System.out.println(noSign);
		
		String onlySign=text.replaceAll("\\w", "");//only sign
		System.out.println(onlySign);
		
		
		String onlyletter=text.replaceAll("\\d", "").replaceAll("\\W", "");
		System.out.println(onlyletter);
		
		
	}


}
