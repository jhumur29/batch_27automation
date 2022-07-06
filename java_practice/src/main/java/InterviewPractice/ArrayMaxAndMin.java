package InterviewPractice;

import java.util.Arrays;

public class ArrayMaxAndMin {
	public static void main(String[] args) {
		int[] myArray= {2,4,6,23,75,68};
		
		int max =Arrays.stream(myArray).max().getAsInt();
		System.out.println("max value= "+max);
		
		int secondMax=Arrays.stream(myArray).filter(i-> i<max).max().getAsInt();
		System.out.println("2nd max= "+ secondMax);
		
	
		
		int min =Arrays.stream(myArray).min().getAsInt();
		System.out.println("min value= "+min);
		
		int secondMin=Arrays.stream(myArray).filter(i-> i>min).min().getAsInt();
		System.out.println("2nd min= "+ secondMin);
		
		
		
	}

}
