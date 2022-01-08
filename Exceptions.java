package Java;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter Number1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Number2: ");
            int num2 = sc.nextInt();
            try {
                int result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
            }
			catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("End of the operation");
            System.out.print("Do you want to continue?(y/n): ");
            sc.nextLine();
            choice = sc.next().charAt(0);
        }while(choice == 'y');
    }
}
