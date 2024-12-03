package basics;

import java.util.ArrayList;

public class Collection 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>L1 = new ArrayList<Integer>();
		L1.add(20);
		L1.add(30);
		L1.add(40);
		L1.add(50);
		System.out.println(L1);
		L1.add(90);
		System.out.println(L1);
		System.out.println(L1.size());
		
		ArrayList<Integer>L2 = new ArrayList<Integer>();
		L2.add(60);
		L2.add(70);
		L2.add(80);
		System.out.println(L2.size());
		System.out.println(L1.addAll(L2));
		System.out.println(L1);
		System.out.println(L1.get(2));
		
		boolean B1= L2.equals(L2);
		System.out.println(B1);
		
		
    }
}
