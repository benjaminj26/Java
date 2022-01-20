/*
*   Experiment 11
*   Author : Benjamin Joseph
*   Date : 20-01-2022
*/

package Java;

import java.io.*;
import java.util.Scanner;

public class Experiment11  {
    public static void main(String[] args) throws IOException {
        FileWriter fout = new FileWriter("Sample.txt");
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        fout.write(str);
        fout.close();

        FileReader fin = new FileReader("Sample.txt");
        BufferedReader br = new BufferedReader(fin);
        fout = new FileWriter("new-sample.txt", true);
        while((str = br.readLine()) != null) {
            fout.write(str);
        }
        fin.close();
        fout.close();
        br.close();

        fin = new FileReader("new-sample.txt");
        br = new BufferedReader(fin);
        System.out.println("The contents of the new file are: ");
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
