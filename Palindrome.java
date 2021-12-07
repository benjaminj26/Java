/*
    Author : Benjamin Joseph
    Date : 07-12-2021
*/

package Lab21;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string: ");
		str = sc.next();
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
