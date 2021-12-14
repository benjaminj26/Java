package Java;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		float num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number: ");
		num1 = sc.nextInt();
		System.out.println("Input the second number: ");
		num2 = sc.nextInt();
		float sum, difference, product,quotient;
		sum = num1+num2;
		difference = num1-num2;
		product = num1*num2;
		quotient = num1/num2;
		System.out.println("Sum="+sum+"\nDifference="+difference+"\nProduct="+product+"\nQuotient="+quotient);
		sc.close();
	}
}
