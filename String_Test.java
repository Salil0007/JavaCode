package basics;

public class String_Test 
{
public static void main(String[] args) 
{
	String a=  "I Love MySelf";
	System.out.println(a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.replaceAll("\\s", ""));
	String reverse="";
	
	for(int i= a.length()-1; i>=0;i--) 
	{
		char T1= a.charAt(i);
		reverse=reverse+T1;
	}
	System.out.println(reverse);
	

}
}
