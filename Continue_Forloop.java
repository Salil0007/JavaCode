package basics;

public class Continue_Forloop
{

	public static void main(String[] args) 
	{
		for(int i=100;i<=200;i++ ) 
		{
			if (i==150)	
			{
				continue;
			}
			System.out.println(i);
		}
	}
 
}
