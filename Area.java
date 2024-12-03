package basics;

public class Area {
	void first()
	{
	double pi=3.14;
	int r=5;
	double area;
	area= pi*r*r;
	System.out.println(area);
	}
	
	void second() 
	{
		double pi=3.14;
		int r=10;
		double area;
		area=pi*r*r;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		
		Area a1= new Area();
		a1.first();
		a1.second();
		
		

	}

}
