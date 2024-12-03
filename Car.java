package basics;
class Vehicle
{
	Vehicle() 
	{
	int a=10;
	int b=20;
	int c= a+b;
	System.out.println(c);
	}
}

public class Car extends Vehicle 
{
	 Car() 
	{
		 super();
		int a=10;
		int b=20;
		int c= b-a;
		System.out.println(c);
	}

    public static void main(String[] args) {
    	new Car();
    	

	}

}
