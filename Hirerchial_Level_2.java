package basics;

class Bollywood
{
	void add()
	{   short a=3002;
	    int b=655;
	    int c=a+b;
	    System.out.println(c);
	
	}
}
class Hollywood extends Bollywood
{
	void sum() 
	{
		long a= 545742424l;
		short b= 31645;
		long c= a-b;
		System.out.println(c);
	}
}
public class Hirerchial_Level_2 extends Bollywood
{
	void plus() 
	{
		double a= 25.265;
		double b= 325.265;
		double c= a+b;
	System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Hirerchial_Level_2 L1 = new Hirerchial_Level_2();
		L1.add();
		L1.plus();
		Hollywood W1= new Hollywood();
		W1.add();
		W1.sum();

	}

}
