package com.practice;
//Bubble Sort using array 
public class BubbleSort {

	public static void main(String[] args)
	{
		int arr[] = {6,5,4,3,2,1};
		int i , j , temp = 0;
		System.out.println("Before Sorting: ");
		for(i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(i = 0 ;i<arr.length;i++) 
		{
			for(j = i+1;j<arr.length;j++) 
			{
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("After Sorting: ");
		for(i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
