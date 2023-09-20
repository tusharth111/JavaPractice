package Java_training;

import java.util.Scanner;

public class SumOfFirstLastDigits {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input number
	     System.out.print("Enter a number: ");
	     int number = scanner.nextInt();

	        // Close the scanner
	     scanner.close();

	        // Ensure the number is positive (handle negative numbers)
	     int positiveNumber = Math.abs(number);

	     // Find the first and last digits
	     int lastDigit = positiveNumber % 10;
	     int firstDigit = 0;

	     while (positiveNumber > 0) 
	     {
	    	 firstDigit = positiveNumber;
	         positiveNumber /= 10;
	     }

	        // Print the results
	     System.out.println("First digit: " + firstDigit);
	     System.out.println("Last digit: " + lastDigit);
	     int Sum = firstDigit + lastDigit;
	     System.out.println("Sum of the First and Last Digit is : "+ Sum);

	}

}
