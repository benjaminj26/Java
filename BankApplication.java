/*
	Java program to create a Bank Application
	Author : Benjamin Joseph
	Date : 06-01-2022
*/

package Java;

import java.util.Scanner;

class  InvalidAmountException extends Exception{
    String message;
    public  InvalidAmountException(String s) {
        message = s;
    }
    public String getMessage() {
        return message;
    }
}

class Customer{
    int accountNumber;
    int bankBalance;
    static int minimumBalance = 2000;
    String name;
    Customer(){
        this.bankBalance = 2000;
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
        try {
            if(change <= 0)
                throw new  InvalidAmountException("\nAmount is less than or equal to zero");
            else {
                this.bankBalance += change;
                System.out.println("The transaction has been finished successfully");
            }
        }
        catch(InvalidAmountException e) {
            System.out.println(e.getMessage());
            System.out.println("Transaction Failed!!");

        }
    }
    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn: ");
        int change = sc.nextInt();
        try {
            if(this.bankBalance - change < minimumBalance)
                throw new InvalidAmountException("\nMinimum balance amount is exceeded");
            else {
                this.bankBalance -= change;
                System.out.println("The transaction has been finished successfully");
            }
        }
        catch(InvalidAmountException e) {
            System.out.println(e.getMessage());
            System.out.println("Transaction failed!!");
        }
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the number of customers: ");
		size = sc.nextInt();
        Customer[] customers = new Customer[size];
		for(int i=0; i<size; ++i) {
            customers[i] = new Customer();
            System.out.println("Enter the details of the "+(i+1)+"th customer:");
			customers[i].getDetails();
            System.out.println();
		}
        do {
            System.out.println("\n1.Display All Account Details");
            System.out.println("2.Search By Account Number");
            System.out.println("3.Deposit Amount");
            System.out.println("4.Withdraw");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int choice;
            choice = sc.nextInt();
            switch(choice) {
                case 1:
					for(int i=0; i<size; ++i) {
						customers[i].display();
                        System.out.println();
					}
					break;
                case 2:
					System.out.print("Enter the Account Number: ");
					int acc = sc.nextInt();
                    int flag = 0;
					for(Customer x : customers) {
						if(x.accountNumber == acc) {
                            flag++;
							x.display();
                            break;
						}
					}
                    if(flag == 0) {
                        System.out.println("The Account Number you entered is Invalid\n");
                    }
                    break;
                case 3:
					System.out.print("Enter the Account Number: ");
					acc = sc.nextInt();
                    flag = 0;
					for(Customer x : customers) {
                        if (x.accountNumber == acc) {
                            flag++;
                            x.deposit();
                            break;
                        }
                    }
                    if(flag == 0) {
                        System.out.println("The Account Number you entered is Invalid\n");
                    }
                        break;
                case 4:
					System.out.print("Enter the Account Number: ");
					acc = sc.nextInt();
                    flag = 0;
					for(Customer x : customers) {
						if(x.accountNumber == acc) {
                            flag++;
							x.withdraw();
                            break;
						}
					}
                    if(flag == 0) {
                        System.out.println("The Account Number you entered is Invalid\n");
                    }
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
            }
        }while(true);
    }
}
