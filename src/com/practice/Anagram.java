package com.practice;
import java.util.Arrays;
public class Anagram {
			boolean fun(String str1, String str2)
			{
				if(str1.length() != str2.length()) 
				{
					return false;
					
				}
				char arr1[] = str1.toCharArray();
				char arr2[] = str2.toCharArray();
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				if(Arrays.equals(arr1, arr2)) 
				{
					return true;
				}
				return false;
			}
			public static void main(String[] args) 
			{
				String str1 = "silent";
				String str2 = "listen";
				Anagram obj = new Anagram();
				boolean ans = obj.fun(str1, str2);
				if(ans == true) 
				{
					System.out.println("anagram");
				}
				else
				{
					System.out.println("Not anagram");
				}
			}

	}

