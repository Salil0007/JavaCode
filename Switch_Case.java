package basics;

import java.util.Scanner;

public class Switch_Case 
{
public static void main(String[] args) 
{

	System.out.println("press 1 to open Chrome Browser");
	System.out.println("press 2 to open Firefox Browser");
	System.out.println("press 3 to open Edge Browser");

	Scanner f1= new Scanner(System.in);
	int selection= f1.nextInt();
	
	switch (selection) 
	{
	case 1:
	
		System.out.println("Lunch Chrome Browser");
	    break;
		
	case 2:
		
		System.out.println("Lunch Firefox Browser");
	    break;

		
	case 3:
		
	    System.out.println("Lunch Edge Browser");
	    break;
	 
	default:
		 System.out.println("Sorry your selection is wrong please try again ");
 
	}
}
}
