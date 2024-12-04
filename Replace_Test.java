package basics;

public class Replace_Test {

	public static void main(String[] args) 
	{
		String input= "Hello! 123Bye 789 ";
		
		String s1= input.replaceAll("[0-9]", "");
		System.out.println(s1);
		
		String s2= input.replaceAll("[A-Z]", "");
		System.out.println(s2);
		
		String s3= input.replaceAll("[a-z]", "");
		System.out.println(s3);
		
		String s4 = input.replace('e', 'y');
		System.out.println(s4);

	}

}
