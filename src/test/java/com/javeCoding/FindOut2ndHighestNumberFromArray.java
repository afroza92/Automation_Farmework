package com.javeCoding;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindOut2ndHighestNumberFromArray {

	@Test

	public static void FindOut2ndHighestNumber() {
		int num[] = { 29, 45, 10, 87, 56, 77, 44 };
		int size = num.length;
		Arrays.sort(num);
		// System.out.println(Arrays.toString(num));
		int result = num[size - 2];
		System.out.println("Second Highest Number ::" + result);
	}
}
// How to sort number from Array?
			// First I initialize the array
			// 2nd write down the Arrays class, we can call sort method
			// 3rd pass the array variable as arguments

			// How to find out second highest number?
			// First I initialize the array, With help of array variable I call the length
			// >> then store it inside the integer variable
			// >>> With help of array object I can use (size-2)
			// >>>> Then it will store inside the int variable
			// >>>> outcome will display in the console
	
	
	
	
	

