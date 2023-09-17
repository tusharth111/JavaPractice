package Java_training;

import java.util.Scanner;

public class SumOfAllNaturalNumbers {
	//Print the Sum of all the Natural Number in between 1 and n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a number : ");
		int n = sc.nextInt();
		int i ,sum = 0;
		for( i = 1;i<=n;i++) {
			sum = sum + i;
			//System.out.println(i);
		}
		System.out.println("Sum of all Natural Number is :"+sum);

	}

}
