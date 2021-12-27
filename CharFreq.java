/*
	Java program to find the frequency of a character in a string
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

public class CharFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		System.out.println("Enter the character whose frequency you want to find:");
		char ch = sc.next().charAt(0);
		int frequency=0;
		for(int i=0; i<str.length(); ++i)
		{
			if(ch == str.charAt(i))
				frequency++;
		}
		System.out.println("Frequency = "+frequency);
		sc.close();
	}

}
