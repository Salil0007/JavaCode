package basics;

class Hero
{     void add() 
	{
		int a=20;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
class Zero extends Hero
{
	 void sum() 
	{
		int a=20;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
}
public class Hirerchial_Level extends Hero
{
	void div() 
	{
		int a=5;
		int b=50;
		int c=b/a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Hirerchial_Level H1 = new Hirerchial_Level();
		H1.add();
		H1.div();
		Zero Z1 = new Zero();
		Z1.add();
		Z1.sum();
	}

}
