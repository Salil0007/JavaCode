package basics;

import java.util.Arrays;

public class Anagram_Test 
{
	public static void main(String[] args) 
	{
		String s1 ="listen";
		String s2 ="silent";
		
		char T1[]=s1.toCharArray();
		char T2[]=s2.toCharArray();
		
		Arrays.sort(T1);
		Arrays.sort(T2);
		System.out.println(Arrays.toString(T1));
		System.out.println(Arrays.toString(T1));
		
	boolean b1= Arrays.equals(T1, T2);
		
		if(b1==true) 
		{
			System.out.println("These 2 strings are Anagram");
		}
		else
		{
			System.out.println("These 2 strings are not Anagram");
		}
	}

}
