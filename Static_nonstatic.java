package basics;

public class Static_nonstatic 
{
	
	static void first_method() 
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	static void second_method() 
	{
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println(c);
	}
	static void Third_method()
	{
		int a=50;
		int b=10;
		int c=a/b;
		System.out.println(c);
			
	}
	void fourth_method() 
	{
		int a=500;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	void fifth_method() 
	{
		int a=500;
		int b=200;
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		first_method();
		second_method();
		Third_method();
		
	Static_nonstatic s1 = new Static_nonstatic();
		s1.fourth_method();
		s1.fifth_method();

	}

}
