package Lab21;

import java.util.Scanner;

class Employees{
	int basePay,da,hra,grossPay;
	void display() {
		System.out.println("The name of this class is Employee");
	}
	void calcSalary() {
		System.out.println("The salary of the Employee is "+grossPay);
	}
}

class Engineer extends Employees{
	Engineer(int bp, int da, int hra){
		this.basePay = bp;
		this.da = da;
		this.hra = hra;
		this.grossPay = bp + (bp*da/100) + (bp*hra/100);
	}
	void display() {		
		System.out.println("The name of the class is Engineer");
	}
	void calcSalary() {
		super.display();
		super.calcSalary();
		this.display();
		System.out.println("The salary of the Engineer is "+(grossPay*2));
	}
}

public class Experiment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bp,da,hra,gp;
		System.out.print("Enter the Base pay: ");
		bp = sc.nextInt();
		System.out.print("Enter the DA: ");
		da = sc.nextInt();
		System.out.print("Enter the HRA: ");
		hra  =sc.nextInt();
		Engineer engineer = new Engineer(bp,da,hra);
		engineer.calcSalary();
	}

}
