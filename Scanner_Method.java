package basics;

import java.util.Scanner;

public class Scanner_Method {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter student name");
	    String name= s1.next();
	    
	    System.out.println("Please enter student ID");
	    int ID= s1.nextInt();
	    
	    System.out.println("Please enter college name");
	    String college=s1.next();
	   
	    System.out.println("Please enter Branch name");
	    String Branch=s1.next();
	    
	    System.out.println("Please enter phone number");
	    long number=s1.nextLong();
	    
	}

}
