package Lab21;

import java.util.Scanner;

class Customer{
	int accountNumber;
	int bankBalance;
	String name;
	Customer(int accountNumber, int bankBalance, String name){
		this.accountNumber = accountNumber;
		this.bankBalance = bankBalance;
		this.name = name;
	}
	void display() {
		System.out.println("Account Number"+this.accountNumber);
		System.out.println("Name: "+this.name);
		System.out.println("Bank Balance: "+this.bankBalance);
	}
	void deposit() {
		System.out.print("Enter the amount to be deposited: ");
		Scanner sc = new Scanner(System.in);
		this.bankBalance += sc.nextInt();
	}
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to be withdrawn: ");
		this.bankBalance -= sc.nextInt();
		System.out.println("The transaction has been finished successfully");
	}
}

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
