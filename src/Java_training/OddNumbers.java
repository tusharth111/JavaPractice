package Java_training;

public class OddNumbers {
	//Print all the Odd numbers in between 1 to 100
	public static void main(String[] args)
	{
		int i, n = 100;
		for(i = 1; i <= n;i++) 
		{
			if(i%2!=0) 
			{
				System.out.println("Odd Numbers are "+i);
			}
		}

	}

}
