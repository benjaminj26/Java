package Lab21;

import java.util.Scanner;

class Employee{
	String name;
	int age;
	int phone;
	String address;
	int salary;
	
	public void printSalary() {
		System.out.println("Salary of the employee = "+salary);
	}
	
}

class Officer extends Employee{
	String specialization;
}

class Manager extends Employee{
	String department;
}

public class Official {

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
		off.address = sc.nextLine();
		System.out.println("Enter the salary of the officer: ");
		off.salary = sc.nextInt();
		System.out.println("Enter the specialization of the officer: ");
		off.specialization = sc.nextLine();
		
		System.out.println("Enter the name of the manager: ");
		man.name = sc.nextLine();
		System.out.println("Enter the age of the manager: ");
		man.age = sc.nextInt();
		System.out.println("Enter the phone number of the manager: ");
		man.phone = sc.nextInt();
		System.out.println("Enter the address of the manager: ");
		man.address = sc.nextLine();
		System.out.println("Enter the salary of the manager: ");
		man.salary = sc.nextInt();
		System.out.println("Enter the department of the manager: ");
		man.department = sc.nextLine();
		sc.close();
	}

}
