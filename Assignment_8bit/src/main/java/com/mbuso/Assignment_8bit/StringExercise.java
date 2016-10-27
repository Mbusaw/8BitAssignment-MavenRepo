package com.mbuso.Assignment_8bit;

public class StringExercise 
{
	public String reverseString(String StringIn)
	{
		String reversedString = new StringBuffer(StringIn).reverse().toString();
		
		return reversedString;
	}
	
	public static void main(String[] args) 
	{
		StringExercise stringExc = new StringExercise();
		
		System.out.println(stringExc.reverseString("Java"));
	}

}
