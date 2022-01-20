/*
*   Experiment 12
*   Author : Benjamin Joseph
*   Date : 20-01-2022
*/

package Java;

import java.util.Scanner;
import java.io.*;

public class Experiment12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fout = new FileOutputStream("Numbers.txt");
        int num;
        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; ++i) {
            num = sc.nextInt();
            fout.write(num);
        }
        fout.close();
        FileInputStream fin = new FileInputStream("Numbers.txt");
        FileOutputStream even = new FileOutputStream("Even.txt");
        FileOutputStream odd = new FileOutputStream("Odd.txt");
        while((num = fin.read()) != -1) {
            if (num % 2 == 0)
                even.write(num);
            else
                odd.write(num);
        }
        fin.close();
        even.close();
        odd.close();
        fin = new FileInputStream("Numbers.txt");
        FileInputStream evenf = new FileInputStream("Even.txt");
        FileInputStream oddf = new FileInputStream("Odd.txt");
        System.out.println("The contents of Numbers.txt is:");
        while((num = fin.read()) != -1) {
            System.out.print(num+" ");
        }
        System.out.println("\n");

        System.out.println("The contents of Even.txt is:");
        while((num = evenf.read()) != -1) {
            System.out.print(num+" ");
        }
        System.out.println("\n");

        System.out.println("The contents of Odd.txt is:");
        while((num = oddf.read()) != -1) {
            System.out.print(num+" ");
        }
        System.out.println("\n");
        fin.close();
        evenf.close();
        oddf.close();
    }
}
