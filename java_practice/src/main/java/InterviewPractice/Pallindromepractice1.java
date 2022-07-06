package InterviewPractice;

public class Pallindromepractice1 {
	
    public static boolean checkPalindrome(String check)
    {
        //holding reverse string
        
        String reverseString = "";
        
        // looping throught (String Check) in reverse order
        
        for(int i = (check.length()-1); i >= 0; i--)
        {
            //Storing all reverse character to reverse string
            
            reverseString = reverseString + check.charAt(i);
        }
        
        // checking reverseString is equal to chcek or not and returing
        // true or false value to calller function
        
        return reverseString.equals(check);
    }
    public static void main(String[] args) 
    {
        System.out.println(checkPalindrome("radar"));
        System.out.println(checkPalindrome("apple"));
        System.out.println(checkPalindrome("1335"));
    }
 

}
