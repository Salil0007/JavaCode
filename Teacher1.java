package basics;

abstract class student2
{
	abstract void add();
	
	abstract void mul();
	
	static void Test1()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
	static void Test2()
	{
		int a=10;
		int b=20;
		int c= a*b;
		System.out.println(c);
	}
}

public class Teacher1 extends student2
{

	public static void main(String[] args) {
	Test1();
	Test2();
	Teacher1 T1= new Teacher1();
	T1.add();
    T1.mul();

	}

	
	void add() {
		
	}

	
	void mul() {
		
	}
      

}
