package Java_training;
import java.util.Scanner;

public class MultiplicationTable {
	//Program to Print Table of any Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for the Table: ");
		int n = sc.nextInt();
		for(int i = 0;i<=10;i++) 
		{
			System.out.println(n +" * " + i +" = " + n*i);	
		}
	}

}
