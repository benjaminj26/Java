/*
	Java program to demonstrate the concept of inheritance
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

class Employee{
	String name;
	int age;
	int phone;
	String address;
	int salary;

	public void printSalary() {
		System.out.println("Salary: "+salary);
	}

}

class Officer extends Employee{
	String specialization;
}

class Manager extends Employee{
	String department;
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Officer off = new Officer();
		Manager man = new Manager();
		System.out.print("Enter the name of the officer: ");
		off.name = sc.nextLine();
		System.out.print("Enter the age of the officer: ");
		off.age = sc.nextInt();
		System.out.print("Enter the phone number of the officer: ");
		off.phone = sc.nextInt();
		System.out.print("Enter the address of the officer: ");
		sc.nextLine();
		off.address = sc.nextLine();
		System.out.print("Enter the salary of the officer: ");
		off.salary = sc.nextInt();
		System.out.print("Enter the specialization of the officer: ");
		sc.nextLine();
		off.specialization = sc.nextLine();

		System.out.println();
		System.out.print("Enter the name of the manager: ");
		man.name = sc.nextLine();
		System.out.print("Enter the age of the manager: ");
		man.age = sc.nextInt();
		System.out.print("Enter the phone number of the manager: ");
		man.phone = sc.nextInt();
		System.out.print("Enter the address of the manager: ");
		sc.nextLine();
		man.address = sc.nextLine();
		System.out.print("Enter the salary of the manager: ");
		man.salary = sc.nextInt();
		System.out.print("Enter the department of the manager: ");
		sc.nextLine();
		man.department = sc.nextLine();

		System.out.println();
		System.out.println("Details of the Officer");
		System.out.println("Name: "+off.name);
		System.out.println("Age: "+off.age);
		System.out.println("Phone Number: "+off.phone);
		System.out.println("Address: "+off.address);
		off.printSalary();
		System.out.println("Specialization: "+off.specialization);

		System.out.println();
		System.out.println("Details of Manager");
		System.out.println("Name: "+man.name);
		System.out.println("Age: "+man.age);
		System.out.println("Phone Number: "+man.phone);
		System.out.println("Address: "+man.address);
		man.printSalary();
		System.out.println("Department: "+man.department);
		sc.close();
	}

}
