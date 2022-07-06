package InterviewPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class listPractice {
	
	public static void main(String[] args) {
		
		// Name Print Alphabetically from a List of Names
				List<String> strList = Arrays.asList("irfan","bob", "ashraf", "farhana", "dola");
				//Collections.sort(strList);
				strList.sort(Comparator.naturalOrder());
				System.out.println(strList);

				// Name Print Reverse Order from a List of Names
				List<String> strList1 = Arrays.asList("irfan","ashraf","farhana","dola");
				strList1.sort(Comparator.reverseOrder());
				System.out.println(strList1);

				// Number Print Descending order from a List of Numbers
				List<Integer> number = Arrays.asList(7, 4, 52, 8, 7, 21, 3);
				Collections.sort(number);
				System.out.println(number);

				
				// Number prints Reverse Order from a List of Numbers
				List<Integer> number1 = Arrays.asList(7, 4, 52, 8, 7, 21, 3);
				number1.sort(Collections.reverseOrder());
				System.out.println(number1);
	}

}
