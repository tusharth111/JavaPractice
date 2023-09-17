package Java_training;

import java.util.Scanner;
// Java Program to print all natural number in reverse from n to 1
public class ReverseNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a number : ");
		int n = sc.nextInt();
		for(int i = n;i>=1;i--) {
			System.out.println(i);
		}

	}

}
