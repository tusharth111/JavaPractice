package Java_training;
//Write a program in Java to read n number of values in an array and display it 
//in reverse order
import java.util.Scanner;
public class ReverseOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,n = 4;
		int arr[] = new int [n];
		System.out.println("Enter the elements : ");
		for( i = 0;i<n;i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements are : ");
		for(i = 0;i<n;i++) 
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Reverse of the array elements : ");
		for(i = n-1;i>=0;i--) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
