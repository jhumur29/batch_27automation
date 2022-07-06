package InterviewPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysRemoveDuplicate {
	void getRemoveDuplicate() {
		int [] myArray= {2,9,2,7,8,9,6,5,4,5};
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		
		List<Integer> myList=Arrays.asList(2,9,2,7,8,9,6,5,4,5);
		Set<Integer> mySet=new HashSet<>(myList);
		System.out.println("remove my duplicate= "+mySet);
	}

	public static void main(String[] args) {
		new ArraysRemoveDuplicate().getRemoveDuplicate();
		
	}
}
