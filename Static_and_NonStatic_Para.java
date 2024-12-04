 package basics;

public class Static_and_NonStatic_Para {
	
	static void add(int a, int b) 
	{
		System.out.println("Hello");
	}
	
	void sum (int a, float b) 
	{
		System.out.println("Come hear");
	}

	public static void main(String[] args) 
{
	Static_and_NonStatic_Para f1 = new Static_and_NonStatic_Para();	
		add(1, 2);
		f1.sum(10, 23.70f);
}
}
