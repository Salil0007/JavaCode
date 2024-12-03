package basics;

public class Local_Global_Method {
	
	static int a=10;
	final static int b=20;
	static void add() 
	{
	System.out.println(a+b);	
	}
	void sub() 
	{
		int a=25;
		int b=25;
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Local_Global_Method G1= new Local_Global_Method();
		G1.sub(); 
		add();
	}

}
