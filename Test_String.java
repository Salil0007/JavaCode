package basics;

public class Test_String {

	public static void main(String[] args) 
	{
		String a1= "Welcome India";
		System.out.println(a1.indexOf('c'));
		
		String str = "Programming ";
		System.out.println(str.charAt(4));
		
		String str1 = "Hello,";
	    String str2 = "World";
	    System.out.println(str1.concat(str2));
	    
	    String name = "Welcome to Java Programming";
	    System.out.println(name.substring(11));
	    
	    String P1 = "Programming is fun";
	    System.out.println(P1.substring(0,11));

	}

}
