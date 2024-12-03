package basics;

public class Method_overloading 
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
	void add(String a, int b) 
	{
	   System.out.println(a+b);
	}
/*	 static void add(int a, int b, int c) 
	 {
		 int sum=a+b*c;
		 System.out.println(sum);
	 }
	 static void add(int a, double b, int c) 
	 {
		 double sum=a+b-c;
		 System.out.println(sum);
	 }
	 static void add(String a, int b,int c) 
		{
		   System.out.println(a+b+c);
		}
*/ 

	public static void main(String[] args) 
    {
	   Method_overloading n1=new Method_overloading();
	   n1.add(100, 25);
	   n1.add(50, 87.98);
	   n1.add("Welcome", 25);
/*	   add(20, 25, 10);
	   add(15, 25.35, 20);
	   add("Automation", 1, 1);
*/	}
	


	

}


