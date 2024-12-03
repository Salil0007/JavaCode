package basics;
interface classA
{
	void login();
	
}
interface classB 
{
	void logout();
	
}
public class Interface implements classA,classB
{

	public static void main(String[] args) {
		Interface I1 = new Interface();
		I1.login();
		I1.logout();

	}

	public void login() 
	{
		
		System.out.println("Username");
	}

	public void logout() 
	{
		System.out.println("Password");
		
	}

}
