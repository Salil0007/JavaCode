package basics;

public class NestedIfElse {

	public static void main(String[] args) 
{

		int a=10;
		int b=20;
		int c=30;
		
		if (b<c) 
		{
			if(a>c) 
			{
				System.out.println("1");
			}
			else 
			{
				System.out.println("2");
			}
		}
		else {
			System.out.println("3");
		}
}

}
