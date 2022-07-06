package InterviewPractice;
//write a code to check pallindrome 
//check mom is pallindrome or not
//login
//1)reverse the string
//2)after and before reverse = same
public class Palindrome {
	
	void getPallindromeCheck(String text) {
		
		//reverse==>negative loop,reverse()= String no, SB/SF
		
		StringBuffer reverseText = new StringBuffer(text).reverse();

		System.out.println(reverseText);
		
		//before and after = same==> java condition= if else conditional statement
		if(text.equals(reverseText.toString())) {
			System.out.println("Its pallindrome");
		}else {
			System.out.println("its not pallindrome");
	}}
public static void main(String [] args) {
	new Palindrome().getPallindromeCheck("smarttech");
	
}
}
