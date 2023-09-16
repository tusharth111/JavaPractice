package com.practice;

public class palindrome {

	public static void main(String[] args) {
		//to do 1 - get a number from  the user
		int number = 101;
		int temp;
		int reverse = 0;
		// to do 2 - hold the number in temporary variable
		temp = number;
		// to do 3 - create loop untill the number is less than 0 
		while(number > 0) {
			//to do 4 - get the last number by module the 10 with it 
			int remainder = number % 10;
			reverse = (reverse *10)+remainder;
			
			number  = number /10;
			
		}
		if(reverse == temp) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not a palindrome");
		}
	}

}
