package com.practice;

public class Rotation {

	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		int i ;
		for(int j = 0;j<(arr.length+1)/2;j++)
		{
			int t = arr[0];
			for( i = 1;i<arr.length;i++) 
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length - 1] = t; 
		}	
		System.out.print("after rotation: ");
		for(i = 0;i<arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
