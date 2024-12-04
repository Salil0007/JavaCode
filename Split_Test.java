package basics;

import java.util.Arrays;

public class Split_Test 
{
	public static void main(String[] args) 
	{
		String s1= "Java is fun";
		String s2[]= s1.split(" ");
		System.out.println(Arrays.toString(s2));
		
		String s3 = "Python Java C++";
		String s4[]= s3.split(",");
		System.out.println(Arrays.toString(s4));
		
		String s5 = "Java is fun to learn";
		String s6[]= s5.split(" ", 3);
		System.out.println(Arrays.toString(s6));
		
		String s7 = "Best learning Automation from MKT";
		String s8[]=s7.split(" ");
		System.out.println(Arrays.toString(s8));
		System.out.println(s8.length);
		
		}
}
