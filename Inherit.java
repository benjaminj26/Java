/*
	Java program to demonstrate the concept of inheritance
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

class Person {
    String name, gender;
    int age;
}

class Employee extends Person {
    String department;
    int empid;

    Employee(String name, int age, String gender, String department, int empid) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.empid = empid;
    }
    void show() {
        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nDepartment: "+department+"\nEmployee ID: "+empid);
    }
}

public class Inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, gender, department;
        int age, empid;
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Gender: ");
        sc.nextLine();
        gender = sc.nextLine();
        System.out.print("Department: ");
        department = sc.nextLine();
        System.out.print("Employee ID: ");
        empid = sc.nextInt();
        Employee emp = new Employee(name,age,gender,department,empid);
        emp.show();
    }
}
