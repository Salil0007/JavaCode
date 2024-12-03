package basics;

public class This_Constractor 
{
	This_Constractor(String employee_name)
	{
		this(4669," Beyond India");
		String employee= employee_name;
		System.out.println("employee name is"+employee);
	}
	This_Constractor(int employee_ID, String Company_name)
	{
		this(" Manager", 85694);
		int EID= employee_ID;
		String Cname= Company_name;
		System.out.println("employee name is"+Cname);
		System.out.println("enployee id is"+EID);
	}
	This_Constractor(String designation, int salary)
	{
		int Esalary= salary;
		String Edesignation= designation;
		System.out.println("employee name is"+Esalary);
		System.out.println("enployee id is"+Edesignation);
	}
	
	public static void main(String[] args) {
		new This_Constractor(" Nikhil");
	}
}
