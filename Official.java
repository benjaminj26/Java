package Lab21;

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
		System.out.println("Enter the name of the officer: ");
		off.name = sc.nextLine();
		System.out.println("Enter the age of the officer: ");
		off.age = sc.nextInt();
		System.out.println("Enter the phone number of the officer: ");
		off.phone = sc.nextInt();
		System.out.println("Enter the address of the officer: ");
		char ch = sc.next().charAt(0);
		off.address = sc.nextLine();
		System.out.println("Enter the salary of the officer: ");
		off.salary = sc.nextInt();
		System.out.println("Enter the specialization of the officer: ");
		ch = sc.next().charAt(0);
		off.specialization = sc.nextLine();
		
		System.out.println("Enter the name of the manager: ");
		man.name = sc.nextLine();
		System.out.println("Enter the age of the manager: ");
		man.age = sc.nextInt();
		System.out.println("Enter the phone number of the manager: ");
		man.phone = sc.nextInt();
		System.out.println("Enter the address of the manager: ");
		ch = sc.next().charAt(0);
		man.address = sc.nextLine();
		System.out.println("Enter the salary of the manager: ");
		man.salary = sc.nextInt();
		System.out.println("Enter the department of the manager: ");
		ch = sc.next().charAt(0);
		man.department = sc.nextLine();
		sc.close();
		
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
	}

}
