package basics;

import java.util.Scanner;

public class Switch_Week 
{

	public static void main(String[] args) 
	{
		
		Scanner S1= new Scanner(System.in);
		System.out.println("press 1 to Monday");
		System.out.println("press 2 to Tuesday");
		System.out.println("press 3 to Wednesday");
		System.out.println("press 4 to Thursday");
		System.out.println("press 5 to Friday");
		System.out.println("press 6 to Saturday");
		System.out.println("press 7 to Sunday");
		int selection= S1.nextInt();
		
		switch (selection) 
		{
		case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday"); 

            break;
        case 3:
            System.out.println("Wednesday");
            break;  

        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
		
		
		default:
			System.out.println("You are enter a wrong value");
		}

	}

}
