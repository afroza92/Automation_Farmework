package com.testNGAnnotation;

import org.testng.annotations.Test;

public class InvocationCountTest {
 
		@Test(invocationCount = 10)
		public void gettest() {
			System.out.println("Test will execuated");
		}

	}

