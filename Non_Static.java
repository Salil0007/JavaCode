package basics;

public class Non_Static {
	
	void add() 
	{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Non_Static n1= new Non_Static();
		
				n1.add();
	}

}
