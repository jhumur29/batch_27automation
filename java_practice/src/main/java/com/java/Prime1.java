package com.java;
//Checking Prime Number for a specific number--
public class Prime1 {
public static void main(String[] args) {
		
		int num=17;
		int count=0;
		
		if (num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i ==0)
					count++;	
			}
			if(count==2) {
				
				System.out.println("It's a Prime Number");
			}
			else {
				System.out.println("Not a Prime Number");

			}
		
		}
		else {
			System.out.println("Not a Prime Number");
		}
	

	}


}
