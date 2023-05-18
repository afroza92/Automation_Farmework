package com.javeCoding;

public class FindOutEvenAndOddNumber {

	// How to find out Even And Odd Number ?
	
	public static void main(String[] args) {
		int num= 10;
		for(int i = 0 ;i<num;i++) {
			if(i%2 ==0) {// Mod ==> %
				System.out.println("This is even Number :: "+i);
			}
			else {
				System.out.println("This is Odd Number :: "+i);
			}
			}
	}
	}
	//first we initialize a number , then we call for loop. inside loop i start with 0, i less than number, i++ means continue loop
	// then we put if else condition if i divide 2 and remainder is 0 then we get even number if i divide 2 and remainder is not equal 0 than 
	//we get odd number. and with says print out we get answer in console


