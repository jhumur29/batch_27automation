package com.java;

public class StringConvert {
public void getStringConvert(String text) {
	double value=Double.parseDouble(text);
	System.out.println(value);
	
}

public static void main(String[] args) {
	new StringConvert().getStringConvert("20.50");
	
}

}
