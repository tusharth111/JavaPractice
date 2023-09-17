package Java_training;
import java.util.Scanner;
public class SumOfOddNumbers {
	//Print the Sum of all the Odd Numbers from 1 to n 
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,Sum = 0;
		for(i = 1; i <n;i++) 
		{
			if(i%2!=0) 
			{
				//System.out.println("Odd Numbers are "+i);
				Sum = Sum + i;	
			}
		}
		System.out.println("Sum of all the Odd numbers is : "+Sum );
	}
}
