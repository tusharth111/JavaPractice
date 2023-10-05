//90 Degree Rotation of a 2-D Array 
package com.practice;
import java.util.Scanner;

public class MultiDimensional90DegreeRotation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows : ");
		int r  = sc.nextInt(); 
		System.out.println("enter the rows : ");
		int c  = sc.nextInt();
		System.out.println("Enter the Elements ");
		int arr[][] =  new int [r][c];
		int i ,j;
		for(i = 0;i<r;i++)//First took elements from the user 
		{
			for(j=0;j<c;j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements are ");
		for(i = 0;i<r;i++)//Displayed the elements 
		{
			for(j=0;j<c;j++) 
			{
				System.out.print(arr[i][j] + " "); 
			}
			System.out.println();
		}
		System.out.println(" 90 Degree Rotation of a 2-D Array : ");
		for(i = 0;i<r;i++)
		{
			for(j=2;j>=0;j--) 
			{
				System.out.print(arr[j][i] + " "); 
			}
			System.out.println();
		}

	}

}
