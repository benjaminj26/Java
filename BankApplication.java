package Lab21;

import java.util.Scanner;

class Customer{
	int accountNumber;
	int bankBalance;
	String name;
	Customer(){
		this.bankBalance = 0;
	}
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Account Number: ");
		this.accountNumber = sc.nextInt();
		System.out.print("Enter the name: ");
		sc.nextLine();
		this.name = sc.nextLine();
	}
	void display() {
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Name: "+this.name);
		System.out.println("Bank Balance: "+this.bankBalance);
	}
	void deposit() {
		System.out.print("Enter the amount to be deposited: ");
		Scanner sc = new Scanner(System.in);
		int change = sc.nextInt();
		this.bankBalance += change;
		System.out.println("The transaction has been finished successfully");
	}
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to be withdrawn: ");
		int change = sc.nextInt();
		this.bankBalance -= change;
		System.out.println("The transaction has been finished successfully");
	}
}

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the number of customers: ");
		size = sc.nextInt();
		Customer[] customers = new Customer[size];
		for(int i=0; i<size; ++i) {
			customers[i].getDetails();
		}
		do {
			System.out.println("1.Display All Account Details");
			System.out.println("2.Search By Account Number");
			System.out.println("3.Deposit Amount");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			int choice;
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					for(int i=0; i<size; ++i) {
						customers[i].display();
					}
					break;
				case 2:
					System.out.print("Enter the Account Number: ");
					int acc = sc.nextInt();
					for(Customer x : customers) {
						if(x.accountNumber == acc) {
							x.display();
						}
					}
					break;
				case 3:
					System.out.print("Enter the Account Number: ");
					acc = sc.nextInt();
					for(Customer x : customers) {
						if(x.accountNumber == acc) {
							x.deposit();
						}
					}
					break;
				case 4:
					System.out.print("Enter the Account Number: ");
					acc = sc.nextInt();
					for(Customer x : customers) {
						if(x.accountNumber == acc) {
							x.withdraw();
						}
					}
					break;
				case 5:
					System.exit(0);
			}
		}while(true);
	}

}
