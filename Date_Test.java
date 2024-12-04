package basics;

import java.util.Date;

public class Date_Test {

	public static void main(String[] args) 
	{
		Date d1= new Date();
		System.out.println(d1.getTime());

		Date d2= new Date(d1.getTime());
		System.out.println(d2);
		String s1= d2.toString();
		String day= s1.substring(0, 3);
		System.out.println(day);
		String month= s1.substring(4, 7);
		System.out.println(month);
		String date= s1.substring(8, 10);
		System.out.println(date);
		String year= s1.substring(s1.length()-4);
		System.out.println(year);
		System.out.println(day.concat(",").concat(" ").concat(month).concat(" ").concat(date).concat(" ").concat(year));

	}

}
