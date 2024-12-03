package basics;

import java.util.Scanner;

public class Addition_Run_Time 
{

	public static void main(String[] args) 
{

		/*Scanner f1 =new Scanner(System.in);
		System.out.println("Please enter your name");
		    String name=   f1.next();*/
		
		Scanner f1 =new Scanner(System.in);
		System.out.println("enter the value of a");
		   int a=  f1.nextInt();
			System.out.println("enter the value of b");
		   int b= f1.nextInt();
		   int sum= a+b;
		   System.out.println("both equal to"+sum);
}

}
