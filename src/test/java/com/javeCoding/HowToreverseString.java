package com.javeCoding;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class HowToreverseString {
	
	
		// 1st method How to reverse string without using inbuilt method?
		//@Test
		public static void reverseString() {
			String value = "Infosys";
			char[] store = value.toCharArray();

			for (int i = (store.length) - 1; i >= 0; i--) {
				System.out.println(store[i]);
			}

		}

	//2nd method How to reverse string with using inbuilt method (with help of Collections java utility class)?

		@Test
		public static void reverseStringWithMethod() {

			Integer num[] = { 1, 2, 3, 4, 6, 7, 8, 10, 20, 30, 50 };
			// Collections is java utility class
			Collections.reverse(Arrays.asList(num));
			System.out.println(Arrays.toString(num));
		}
	}


	//we declare String value. there is multiple character there.in order to break down with help of variable,we have to call toCharArray method
	// and store it in single dimension char array to break down value and store here. in order to print out because of multiple value we create basic loop
	// int i = char array variable than count lenght. and i--to decrement value then we call sys print and pass char arrray variable and pass argument as i
	// and we can get in console


