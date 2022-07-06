package com.java;

public class PallindromePractice {
	void getPallindromePractice(String text) {
		StringBuffer reversetext =new StringBuffer(text).reverse();
		System.out.println(reversetext);
		if(text.equals(reversetext.toString())) {
			System.out.println("its palindrome");
		}
		
	}

}
