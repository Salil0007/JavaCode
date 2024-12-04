package basics;

public class Equal_Ignore {

	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2="hello";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		String s3 = "Getting hands-on with Java is fun.";
		
		boolean T1= s3.contains("Java");
		System.out.println(T1);
		
		boolean T2= s3.contains("Python");
		System.out.println(T2);

	}

}
