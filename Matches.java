package basics;

public class Matches {

	public static void main(String[] args) 
	{
		String s1 = "myJava";
		boolean b1= s1.matches("......");
		System.out.println(b1);
		
		System.out.println(s1.matches("m(.*)"));
		
		System.out.println(s1.matches("(.*)y"));

	}

}
