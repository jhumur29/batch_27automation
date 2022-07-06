package com.java;

import java.io.PrintStream;

public class Arrays {
	public static class ArrayCopy 
	{
	    
	    private static int[] bubbleSort(int[] newArray) 
	    {
	        int temp;
	        for(int i = 0; i < newArray.length; i++)
	        {
	            for(int j = 1; j < (newArray.length - i); j++)
	            {
	                if(newArray[j-1] > newArray[j])
	                {
	                   temp = newArray[j-1];
	                   newArray[j-1] = newArray[j];
	                   newArray[j] = temp;
	                }
	            }
	        }
	        return newArray;
	    }
	    public static void main(String[] args) 
	    {
	        int[] firstArray = {70,20,60,40,80};
	        int[] secondArray = {10,50,30,90,99};
	        int[] newArray = new int[firstArray.length + secondArray.length];
	        System.arraycopy(firstArray, 0, newArray, 0, secondArray.length);
	        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
	       // System.out.println("Merged Array: "+Arrays.toString(newArray));
	        // i can use Arrays.sort method but i decided to use bubbleSort
	        // algorithm
	        //Arrays.sort(newArray);
	       // System.out.println("Sorted Array: "+Arrays.toString(bubbleSort(newArray)));
	    }
	}




}
	