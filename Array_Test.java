package basics;

import java.util.Arrays;

public class Array_Test 
{

	public static void main(String[] args)
	{
		boolean b1 []= new boolean[3];
		b1[0]=true;
		b1[1]=false;
		b1[0]=true;
		System.out.println(Arrays.toString(b1));
		
		double d1[]=new double[4];
		d1[0]=23.32;
		d1[1]=35.36;
		d1[2]=45.85;
		d1[3]=58.34;
		System.out.println(Arrays.toString(d1));

	}
}
