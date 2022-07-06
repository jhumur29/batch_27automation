package InterviewPractice;

public class ExceptionPractice {
	static String name;
	
	public static void main(String[] args) {
	
	System.out.println(name);
	
	try {
		System.out.println(name.concat("jhumu"));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	 System.out.println("bye");
}
}