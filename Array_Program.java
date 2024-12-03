package basics;

import java.util.Arrays;

public class Array_Program {

	static int countofAlphabet=0;
	static int countofDigit=0;
	static int countofspace=0;
	public static void main(String[] args) 
	{
		String input=" Hello! 123@ jAvA_";
		char c1[]= input.toCharArray();;
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length; i++) 
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			if(b1==true) 
			{
				countofAlphabet++;
			}
			
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true) 
			{
				countofDigit++;
			}
			
			boolean b3=Character.isWhitespace(c1[i]);
			if(b3==true) 
			{
				countofspace++;
			}
			
		}
		int specialcharacter=c1.length-(countofAlphabet+countofDigit+countofspace);
		
		
		System.out.println("Number of alphabets are - "+countofAlphabet);
		System.out.println("Number of numerics are - " +countofDigit);
		System.out.println("Number of spaces are - "+countofspace);
		System.out.println("Number of special characters are - "+specialcharacter);
		

	}

}
