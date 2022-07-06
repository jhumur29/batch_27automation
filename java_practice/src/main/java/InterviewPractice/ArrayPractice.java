package InterviewPractice;

import java.util.Arrays;
import java.util.List;

public class ArrayPractice {
	public void getMyArray(int[] myArray) {
		System.out.println(Arrays.toString(myArray));
		List<Integer> myList=Arrays.asList(2,3,4,2,3,4,5,6);
		System.out.println(myList);
	}

	public static void main(String[] args) {
		int[] myArray= {2,3,4,2,3,4,5,6};
		new ArrayPractice().getMyArray(myArray);
		
		
	}
}
