package com.practice;
//Question: Sum of some elements from the array is equal to the target number 
public class Question 
{
	int[] fun(int arr[],int target)
	{
		int temp [ ]= new int[2];
		int i , j;
		for(i =0;i<arr.length;i++) 
		{
			for(j = i+1;j<arr.length;j++) 
			{
				if(arr[i] +arr[j] == target) 
				{
					temp[0] = i;
					temp[1] = j;
				}
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		int target = 9;
		int arr[]= {1,2,3,4,5};
		Question obj = new Question();
		int brr[] = obj.fun(arr,target);
		int i;
		for(i =0;i<brr.length;i++) 
		{
			System.out.println(brr[i]);
		}	
	}

}
