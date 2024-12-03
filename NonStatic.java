package basics;

public class NonStatic 
{

	void add(int a, int b) 
	{
	int sum=a+b;
	System.out.println(sum);
	}
	void add(int a, double b) 
	{
		double result=a*b;
		System.out.println(result);
	}
	
	public static void main(String[] args)
	{
		NonStatic n1=new NonStatic();
		n1.add(100, 25);
		n1.add(50, 87.98);
	}
}
