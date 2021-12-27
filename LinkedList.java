/*
	Java program to implement stack as linked list
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

class Employee1{
	int empid;
	String name;
	String address;
	String department;
	Employee1 next;

	Employee1 push(Employee1 top){
		Scanner sc = new Scanner(System.in);
		Employee1 emp = new Employee1();
		System.out.print("Enter the Employee ID: ");
		emp.empid = sc.nextInt();
		System.out.print("Enter the Name: ");
		sc.nextLine();
		emp.name = sc.nextLine();
		System.out.print("Enter the Address: ");
		emp.address = sc.nextLine();
		System.out.print("Enter the Department: ");
		emp.department = sc.nextLine();
		emp.next = top;
		return emp;
	}

	Employee1 pop(Employee1 top) {
		if(top.next != null) {
			System.out.println("The details of the following employee is deleted");
			top.display();
			top = top.next;
		}
		else{
			System.out.println("The stack is Empty");
		}
		return top;
	}

	void display() {
		if(next != null){
			System.out.println("Employee ID: " + empid);
			System.out.println("Name: " + name);
			System.out.println("Address: " + address);
			System.out.println("Department: " + department);
		}
		else{
			System.out.println("Stack is Empty");
		}
	}
}

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee1 top = new Employee1();
		top.next = null;
		do {
			System.out.print("1.Push\n2.Pop\n3.Display Top\n4.Exit\nEnter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					top = top.push(top);
					break;
				case 2:
					top = top.pop(top);
					break;
				case 3:
					top.display();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid Input");
			}
		} while (true);
	}
}
