package com.practice;
//To count the number of vowels in the string 

public class Vowels 
{
	int fun(String str) 
	{
		int i,c=0;
		for(i =0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch =='e'||ch =='i'|| ch == 'o'|| ch == 'u') 
			{
				c++;
			}else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
			{
				c++;
			}
		}
		return c ;
	}
	public static void main(String[] args) 
	{
		String str = "HellO";
		Vowels obj = new Vowels();
		int ans = obj.fun(str);
		System.out.println(ans);

	}

}
