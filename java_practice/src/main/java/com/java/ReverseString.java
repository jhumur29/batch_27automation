package com.java;
//how to reverse a String
public class ReverseString {
	public static void main(String[] args) {
		// Fast i have to decalire string vareable as per requre  value
				String name="jhumur";
		// then help with the string variable i calling  tochararray method which one help me to convart 
			//string to charecter agine i have to store in to the chat array variable 
				//this char variable contne string value

				 char[]  nm=name.toCharArray();
		//then i have to create a loop, there is many kind of loop like for loop,while loop,advance loop, do while loop.
		//but i am using now basic 	loop 
		// i write the for then perenthiess	open and closed, inside the  perenthiess i am insilize the int variable 
		// then help with char variable dot length whichb one count the value as well as  add the mynass one
		//then,i is greater then equal 0 ; i -- operation which help me to reverse my string 		 
				for(int i =(nm.length)-1;i>=0;i--){
		//if i need to print out inside the paranthesis i am passing the  char variable plus dimension  inside 
		// the dimension i have to pass looping variable name			
				System.out.print(nm[i]);
				
		//finally i get the result
				}
				 
	}

}
