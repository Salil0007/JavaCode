package basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Set_Test {

	public static void main(String[] args) 
	{
		Set l1= new HashSet();
		l1.add(05);
		l1.add(null);
		l1.add(15);
		l1.add("Narayan");
		l1.add(55);
		l1.add(25);
		l1.add(25);
		l1.add("Parth");
		System.out.println(l1);
		
		
	   Iterator l3= l1.iterator();
		
		while(l3.hasNext())
		{
			System.out.println(l3.next());
		}
		
      	System.out.println(l1.remove(55));
      	System.out.println(l1);
		
		boolean l4 = l1.contains(55);
        System.out.println(l4);

	}

}
