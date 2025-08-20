package ab47;

import java.util.Date;

public class Time_Current_Past_Future {

	public static void main(String[] args) {
		Date d1 = new Date();
		long l1 = d1.getTime();
		System.out.println(l1);
		System.out.println(d1);
		String d2 = d1.toString();
		String month = d2.substring(4, 7);
		System.out.println(month);
		String year = d2.substring(d2.length() - 4);
		System.out.println(year);
		String date = d2.substring(8, 10);
		System.out.println(date);
		String dateformat1 = date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(dateformat1);
		String dateformat2 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(dateformat2);
		//Future Date
		Date d3 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 1));
		System.out.println(d3);
		//Past Date
		Date d4 = new Date(d1.getTime() - (1000 * 60 * 60 * 24 * 1));
		System.out.println(d4);

	}

}
