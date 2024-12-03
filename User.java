package basics;

class Admin
{
	void login() 
	{
		System.out.println("Login with mobile");
	}
}
class Teacher extends Admin
{
	void login() 
	{
		super.login();
		System.out.println("Login with email");
	}
}
class student1 extends Teacher
{
	void login() 
	{
		super.login();
		System.out.println("Login with Username");
	}
}
public class User extends student1
{
	
	void login() 
	{
		super.login();
		System.out.println("Login with Lastname");
	}

	public static void main(String[] args) 
	{
		User U1= new User();
		U1.login();
		
	}

}
