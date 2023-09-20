package com.practice;

public class FirstDigitOfNumber {

	public static void main(String[] args) {
		int number = 2123;
		int firstDigit =0;
		 while(number!=0) {
	            firstDigit = number%10;
	            number /= 10;
	        }
	        System.out.println("First digit: "+firstDigit);
	}

}
