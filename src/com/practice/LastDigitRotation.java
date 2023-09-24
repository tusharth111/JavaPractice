package com.practice;

public class LastDigitRotation {

	public static void main(String[] args) {
		/*
		 Rotation from last array elements to first element
		  	  11 22 33 44 55
		index-0  1  2  3  4
		  	  55 11 22 33 44
		 */
				int arr[] = {11,22,33,44,55};
				int t = arr[arr.length-1];// 55 in t 
				int i ;
				for(i = arr.length-2;i>=0;i--)  // loop i = 3; i>=0;i--
				{
					arr[i+1]=arr[i];//arr[5] = arr[4];
				}
				System.out.print("After Rotation: ");
				arr[0] = t;// t in arr[0];
				for(i =0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
	}
