package com.practice;
/*
 Program 
1111
1111 
1111
1111
 to 
1111
1  1
1  1
1111

*/

import java.util.Scanner;

public class ArrayToBoxPattern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int r = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int c = sc.nextInt();
		int arr [][] = new int [r][c];
		int i ,j;
		System.out.println("Enter the elements : ");
		for(i = 0; i<r;i++) 
		{
			for(j =0 ;j<c;j++) 
			{
				arr[i][j]= sc.nextInt();	
			}
		}
		System.out.println("elements are: ");
		for(i = 0; i<r;i++) 
		{
			for(j =0 ;j<c;j++) 
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println( );
		}
		System.out.println("Elements into box: ");
		for(i = 0; i<r;i++) 
		{
			for(j =0;j<c;j++) 
			{
				if(i == 0 || i == r-1 || j == 0 || j == c-1)   {
					System.out.print(arr[i][j]+"  ");
				}
				else 
				{
					System.out.print("  "+" ");
				}
			}
			System.out.println( );
		}
	}

}
