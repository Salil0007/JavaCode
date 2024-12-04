package basics;

public class Contractor_overload {
	
	Contractor_overload()
	{
		System.out.println("Hello");
	}
	
	Contractor_overload(int a)
	{
		System.out.println("Come"); 
		
	}

	public static void main(String[] args) {
		
		Contractor_overload f1 = new Contractor_overload();
		new Contractor_overload(9);

	}

}
