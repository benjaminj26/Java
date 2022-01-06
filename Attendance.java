/*
	Java program to assign grade based on the attendance percentage of a student
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		int att_perc;
		System.out.println("Input your attendance percentage: ");
		att_perc = sc.nextInt();
		if(att_perc >= 90)
			System.out.println(name+" has scored A Grade");
		else if(att_perc >= 80)
			System.out.println(name+" has scored B Grade");
		else if(att_perc >= 70)
			System.out.println(name+" has scored C Grade");
		else if(att_perc >= 60)
			System.out.println(name+" has scored D Grade");
		else if(att_perc >= 50)
			System.out.println(name+" has scored P Grade");
		else
			System.out.println(name+" has scored F Grade");
		sc.close();
	}

}
