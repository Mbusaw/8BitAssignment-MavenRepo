package com.mbuso.Assignment_8bit;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class IntegerExerciseTest   
{
	private IntegerExercise intExercise;
	
	@Before 
	public void setUp() throws Exception 
	{
		intExercise = new IntegerExercise();
	}


	@Test 
	public void testIsEven() 
	{
		assertTrue(intExercise.isEven(0));
		assertFalse(intExercise.isEven(3));
		assertTrue(intExercise.isEven(6));
    }
   
	@Test 
	public void testIsPrime()
	{
		assertFalse(intExercise.isPrime(1));
		assertTrue(intExercise.isPrime(3));
		assertFalse(intExercise.isPrime(110));
		assertTrue(intExercise.isPrime(113));
		
    }
   
	@Test
	public void testIsPalindrome()
	{
		assertFalse(intExercise.isPalindrome(10));
		assertTrue(intExercise.isPalindrome(101));
		assertTrue(intExercise.isPalindrome(123321));
    }
}
