package Java;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		// Sum of two integer numbers
		int num1=100, num2=234;
		int sum = num1+num2;
		System.out.println("The sum of the two numbers is: "+sum);

		// Sum of two floating point numbers
		float fnum1=25.4764f, fnum2=2.8753f;
		float fsum= fnum1+fnum2;
		System.out.println("The sum of the floating point numbers is: "+fsum);

		// Sum of two numbers input by the user
		System.out.println("Input two numbers: ");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum = num1 + num2;
		System.out.println("The sum of the two numbers that you entered is: "+sum);

		// Concatenating two strings
		String str1,str2;
		System.out.println("Enter the first string: ");
		str1 = sc.next();
		System.out.println("Enter the second string: ");
		str2 = sc.next();
		System.out.println("The strings after concatenation is\n"+str1+str2);
		sc.close();
	}
}
