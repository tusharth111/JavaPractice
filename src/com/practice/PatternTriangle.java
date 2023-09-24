package com.practice;

/*
  1
  11
  222
  4444
  55555
  
 */
public class PatternTriangle {

	public static void main(String[] args) {
		for(int i = 0;i<5;i++) //rows
		{
			for(int j = 0;j<=i;j++)//Printing the value i
			{
				System.out.print(i+" ");
			}
			System.out.println( );
		}
	}
}
