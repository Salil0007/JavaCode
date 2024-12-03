package basics;

public class Employee  
{
	Employee(String a, int b)
	{
		System.out.println("This is employee name & ID");
	}

	Employee(String a,String b)
	{
		System.out.println("This is employee Company & designation");
	}
	Employee(Double a)
	{
		System.out.println("This is employee salary");
	}
	Employee(long a)
	{
		System.out.println("This is employee mobile number");
	}
	
	public static void main(String[] args) 
	{
		new Employee("Salil", 3456);
		new Employee("XYZ","Expert in testing" );
		new Employee(98760.34);
		new Employee(9876543210l);
	}
}
