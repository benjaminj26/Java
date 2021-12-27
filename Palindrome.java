/*
	Java program to check whether a string is palindrome or not
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		str=str.toLowerCase();
		String rev="";
		for(int i=0; i<str.length(); ++i)
		{
			char ch = str.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);
		if(str.equals(rev))
			System.out.println("The string you have entered is a palindrome");
		else
			System.out.println("The string you have entered is not a palindrome");
		sc.close();
	}

}
