package com.practice;
import java.util.Scanner;
public class twoDimension {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arrNum[][];
		int arrTrans[][];
		
		arrNum = new int [3][3];
		arrTrans = new int [3][3];
		
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.println("Enter the integers:["+i+"] ["+j+"]");
				arrNum[i][j] = input.nextInt();
			}
		}
		System.out.println("Entered array:");
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(arrNum[i][j]+" ");
			}
			System.out.println( );
		}
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				arrTrans[j][i] = arrNum[i][j];
			}
		}
		System.out.println("Transpose matrix: ");
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++){
				System.out.print(arrTrans[i][j]+" ");
			}
			System.out.println( );
		}
	}
	}
	

