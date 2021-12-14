package Java;

import java.util.Scanner;

public class Month_Day {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month;
		int year;
		System.out.println("Enter the name of the month: ");
		month = sc.next();
		month = month.toLowerCase();
		System.out.println("Input the year: ");
		year = sc.nextInt();
		if(isLeapYear(year))
		{
			switch(month) {
				case "january": System.out.println("31");
				case "march": System.out.println("31");
				case "may": System.out.println("31");
				case "july": System.out.println("31");
				case "august": System.out.println("31");
				case "october": System.out.println("31");
				case "december": System.out.println("31");
				break;
				case "february": System.out.println("29");
				break;
				case "april": System.out.println("30");
				case "june": System.out.println("30");
				case "september": System.out.println("30");
				case "november": System.out.println("30");
				break;
				default:System.out.println("Invalid Input");
			}
		}
		else
		{
			switch(month) {
				case "january": System.out.println("31");
				case "march": System.out.println("31");
				case "may": System.out.println("31");
				case "july": System.out.println("31");
				case "august": System.out.println("31");
				case "october": System.out.println("31");
				case "december": System.out.println("31");
				break;
				case "february": System.out.println("28");
				break;
				case "april": System.out.println("30");
				case "june": System.out.println("30");
				case "september": System.out.println("30");
				case "november": System.out.println("30");
				break;
				default:System.out.println("Invalid Input");
			}
		}
		sc.close();
	}

	static boolean isLeapYear(int year)
	{
		if(year%4 == 0 )
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
	}
}
