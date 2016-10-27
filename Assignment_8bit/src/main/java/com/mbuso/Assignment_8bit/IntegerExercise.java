package com.mbuso.Assignment_8bit;

public class IntegerExercise 
{
	public boolean isEven(int randomInt)
	{
		if(randomInt%2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isPrime(int randomInt)
	{
		if(randomInt < 2)
		{
			return false;
		}
		if(randomInt == 2 || randomInt == 3)
		{
			return true;
		}
		
		if(randomInt % 2 == 0)
		{
			return false;
		}
		for(int i = 3; i <= Math.sqrt((int)randomInt);++i)
		{
			if((randomInt % i) == 0)
			{
				return false;
			}
		}
		
		return true;
		
		
	}
	
	public boolean isPalindrome(int randomInt)
	{
		String rndmIntReversed,rndmIntString;
		
		rndmIntReversed = "";
		rndmIntString = Integer.toString(randomInt);
		
		for(int pos = rndmIntString.length()-1; pos >= 0;pos--)
		{
			rndmIntReversed = rndmIntReversed + rndmIntString.charAt(pos);
		}
		
		if(rndmIntString.equals(rndmIntReversed))
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) 
	{
		IntegerExercise intExercise = new IntegerExercise();
		
		System.out.println("10 is an even number: " + intExercise.isEven(10));
		System.out.println("6 is a prime number: "+ intExercise.isPrime(6));
		System.out.println("1551 is a palindrome: " + intExercise.isPalindrome(1551));
	}
	
}
