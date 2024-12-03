package basics;

class Super
{
	static void Div() 
	{   int a=10;
		int b=20;
		int c=b/a;
		System.out.println(c);
	}
	static void sub() 
	{   int a=55;
		int b=35;
		int c=a-b;
		System.out.println(c);
	}
	static void add() 
	{   int a=50;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}
}
class parent1 extends Super
{
	void mul() 
	{  int a=50;
	   int b=10;
       int c=a*b;
		System.out.println(c);
	}
	void sum() 
	{  int a=50;
	   int b=10;
       int c=60;
       int d=a+b*c;
		System.out.println(d);
	}
}
public class Multileve_inheritance  extends parent1 
{
	static void add() 
	{   int a=10;
		int b=20;
		int c=50;
		int d=a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		Multileve_inheritance m1 = new Multileve_inheritance();
		m1.mul();
		m1.sum();
		Div();
		sub();
		add();

	}

}
