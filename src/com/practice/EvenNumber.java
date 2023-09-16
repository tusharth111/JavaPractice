
package com.practice;
import java.util.*;
class Even{
	int sum =0;
	void getdata(int a) {
		for(int i =0;i<a;i=i+2) {
			sum = sum +i;
		}
		System.out.println("Sum of the even numbers: "+sum);
	}
}
public class EvenNumber {

	public static void main(String[] args) {
		// Printing sum of the even number.
		Even num = new Even();
		try {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the n :");
			n = sc.nextInt();
			num.getdata( n );
			
		}catch(Exception e){
			System.out.println("Exception = "+e);
			
		}

	}

}
