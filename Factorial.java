package Lab21;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		long fact=1;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		for(int i=num;i>0;--i) {
			fact*=i;
		}
		System.out.println("The factorial of "+num+" is "+fact);
		sc.close();
	}

}