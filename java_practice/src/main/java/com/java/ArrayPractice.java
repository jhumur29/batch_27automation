package com.java;

import java.util.Arrays;

public class ArrayPractice {
	
	//int a=2;
	int [] a = {2,3,4,7};
	 public void totalNumber(){
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 System.out.println(a[i]);}
				 
					 
				 //else {
					// System.out.println("no duplicate");
				 
				 
				// }	 
			 }
			 //System.out.println(a[i]);
		 }
		 System.out.println("no duplicate");
		//System.out.println(a.length);
		// System.out.println(Arrays.toString(a));
		
	}
	 public static void main(String[] args) {
		 ArrayPractice obj= new ArrayPractice();
		 obj.totalNumber();
		 
	 }

}
