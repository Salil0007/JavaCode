package basics;

public class String_2_Test {

	public static void main(String[] args) 
	{
		
		String dr1= "rotator";
		String dr2= "";
		for(int i=dr1.length()-1;i>=0; i--) 
		{
			char v1= dr1.charAt(i);
			dr2=dr2+v1;
		}
			System.out.println(dr2);
		if(dr2.equals(dr1)) 
		{
			System.out.println("This is palindrome");
		}	
		else 
		{
			System.out.println(" Not palindrome");
		}
		
		
		
		String s1 = "Java";
		String s2 = "java";
		boolean b2 = s1.equals(s2);
		System.out.println(b2);
		
		
		String g1="  A very Good Morning !  ";
		System.out.println(g1.trim());

	}

}
