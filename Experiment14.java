package Java;

import java.util.Scanner;

class Table1 {
    void printTable(int n) {
        synchronized (this) {
            for(int i=1; i<=5; ++i) {
                System.out.println(n+"*"+i+" = "+(n*i));
            }
        }
    }
}

class MyTab extends Thread {
    Table1 t;
    int n;
    MyTab(int n, Table1 t) {
        this.n = n;
        this.t = t;
    }
    public void run() {
        t.printTable(n);
    }
}

public class Experiment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table you want to run by Thread1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the table you want to run by Thread2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the table you want to run by Thread3: ");
        int num3 = sc.nextInt();
        Table1 obj = new Table1();
        MyTab t1 = new MyTab(num1, obj);
        MyTab t2 = new MyTab(num2, obj);
        MyTab t3 = new MyTab(num3, obj);

        t1.start();
        t2.start();
        t3.start();
        sc.close();
    }
}
