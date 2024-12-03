package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Test {

	public static void main(String[] args)
	{
		List l1= new ArrayList();
		l1.add(05);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		
		System.out.println(l1);
		
		ListIterator l3= l1.listIterator();
		
		while(l3.hasNext())
		{
			System.out.println(l3.next());
		}
		
		while(l3.hasPrevious())
		{
			System.out.println(l3.previous());
		}
		
		System.out.println(l1.get(3));
		System.out.println(l1.remove(4));
		System.out.println(l1);
		
		boolean l4 = l1.contains(15);
        System.out.println(l4);

	}

}
