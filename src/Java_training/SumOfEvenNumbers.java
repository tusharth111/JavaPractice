package Java_training;

import java.util.Scanner;

public class SumOfEvenNumbers
{
	//Print the Sum of Even Number
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,Sum = 0;
		for(i = 1; i <= n;i++) 
		{
			if(i%2 == 0) 
			{
				//System.out.println("Even Numbers are "+i);
				Sum = Sum + i;	
			}
		}
		System.out.println("Sum of all the Even numbers is : "+Sum );
	}
}
