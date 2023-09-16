package com.practice;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,max,min;
		int [] array = {23,32,32,3243,4,434};
		for (i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("reverse of array");
		for(int j = array.length-1 ;j>=0;j--) {
			System.out.print(array[j]+ " ");
		}
		
	}

}
