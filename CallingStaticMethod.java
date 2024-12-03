package basics;

public class CallingStaticMethod 
{
	static void first_method() 
	{
		System.out.println("First_Method");
	}
	
    static void second_method()
    { 
    	System.out.println("Second_method");
    }
	
    static void third_method() 
    {
    	System.out.println("Third_Method");
    }

    static void fourth_method() 
    {
    	System.out.println("Fourth_Method");
    }
    
    static void fifth_method() 
    {
    	System.out.println("Fifth_Method");
    }
    
    public static void main(String[] args) 
    {
		first_method();
		second_method();
		third_method();
		fourth_method();
		fifth_method();
	}
}
