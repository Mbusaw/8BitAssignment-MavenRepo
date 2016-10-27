package com.mbuso.Assignment_8bit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringExerciseTest 
{
	private StringExercise strExercise;
	private String a,b;
	
	@Before
	public void setUp() throws Exception 
	{
		strExercise = new StringExercise();
		a = new String("HelloWorld");
		b = new String("8BitPlatoon");
	}

	@Test
	public void testReverseString() 
	{
		assertEquals("dlroWolleH", strExercise.reverseString(a));
		assertEquals("nootalPtiB8", strExercise.reverseString(b));
	}

}
