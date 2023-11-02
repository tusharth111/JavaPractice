package Java_training;
//Write a program in Java to find the sum of all elements of the array.
import java.util.Scanner;
public class SumOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i ,sum = 0;
		int arr[] = {1,2,3,4,5};
		for( i = 0;i<arr.length;i++) 
		{
			System.out.println( arr[i]+" ");
		}
		
		for(i = 0;i<arr.length;i++) 
		{
			sum = sum + arr[i];
		}
		System.out.println("SUM OF THE ELEMENTS of the array: "+sum);	
	}
}
