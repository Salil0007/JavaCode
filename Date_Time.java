package basics;

import java.util.Date;

public class Date_Time 
{

	public static void main(String[] args) 
	{
		Date d1= new Date();
		System.out.println(d1.getTime());
		
		Date d2= new Date(d1.getTime());
		System.out.println(d2);
		
		String s1= d2.toString();
		String day= s1.substring(0, 4);
		System.out.println(day);
		String month= s1.substring(4, 7);
		System.out.println(month);
		String date= s1.substring(8, 10);
		System.out.println(date);
		String year= s1.substring(s1.length()-4);
		System.out.println(year);
		System.out.println(day.concat(",").concat(month).concat(" ").concat(date).concat(" ").concat(year));
		
		
		Date d3= new Date();
		System.out.println(d3.getTime());
		
		Date d4= new Date(d3.getTime()+(1000*60*60*24*3));
		System.out.println(d4);
		
		String s2= d4.toString();
		String day1= s2.substring(0, 4);
		System.out.println(day1);
		String month1= s2.substring(4, 7);
		System.out.println(month1);
		String date1= s2.substring(8, 10);
		System.out.println(date1);
		String year1= s2.substring(s1.length()-4);
		System.out.println(year1);
		System.out.println(day1.concat(",").concat(month1).concat(" ").concat(date1).concat(" ").concat(year1)); 
		
		Date d5= new Date();
		System.out.println(d5.getTime());
		
		Date d6= new Date(d5.getTime()-(1000*60*60*24*3));
		System.out.println(d6);
		
		String s3= d6.toString();
		String day2= s3.substring(0, 4);
		System.out.println(day2);
		String month2= s3.substring(4, 7);
		System.out.println(month2);
		String date2= s3.substring(8, 10);
		System.out.println(date2);
		String year2= s3.substring(s3.length()-4);
		System.out.println(year2);
		System.out.println(day2.concat(",").concat(month2).concat(" ").concat(date2).concat(" ").concat(year2));

	}

}
