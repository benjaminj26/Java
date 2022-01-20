/*
*   Java program to show the use of threads
*   Author : Benjamin Joseph\
*   Date : 20-01-2022
*/

package Java;

import java.util.Scanner;

class ClassA extends Thread {
    public void run() {
        for(int i = 0; i<20; ++i) {
            System.out.println("Hello");
        }
    }
}

class ClassB extends Thread {
    public void run() {
        for(int i = 0; i<20; ++i) {
            System.out.println("Goodbye");
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upp = sc.nextInt();
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.start();
        b.start();
    }
}
