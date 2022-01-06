package Java;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int num2 = sc.nextInt();
		try {
			int result = num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not allowed");
		}
	}

}
