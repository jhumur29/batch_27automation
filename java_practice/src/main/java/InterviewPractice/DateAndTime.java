package InterviewPractice;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(date));
	}

}
