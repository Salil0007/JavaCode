package basics;

class Honda
{
	void add()
	{	
		double a=3.25;
	    int b=65;
	    double c=a+b;
	    System.out.println(c);
	
	}
}
class shine extends Honda
{
	void sum() 
	{
		long a= 545742424l;
		int b= 58645;
		long c= a-b;
		System.out.println(c);
	}
}

public class Hirerchial_Level_1 extends Honda
{
	void mul() 
	{
		byte a= 5;
		int b= 58645;
		long c= a*b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		Hirerchial_Level_1 H2= new Hirerchial_Level_1();
		H2.add();
		H2.mul();
		shine D1= new shine();
		D1.add();
		D1.sum();

	}

}
