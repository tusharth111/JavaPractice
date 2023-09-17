
package Java_training;
import java.util.Scanner;
//Print  all Natural number from 1 to n
public class NaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a number : ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
