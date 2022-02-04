/*
    Java program to demonstrate the use of string tokens
    Author : Benjamin Joseph
    Date : 04-02-2022
*/

package Java;

import java.io.*;
import java.util.StringTokenizer;

public class Experiment15 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a few numbers: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size;
        int[] arr = new int[(size=str.length())];
        StringTokenizer st = new StringTokenizer(str);
        for(int i=0; st.hasMoreTokens(); ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum=0;
        for(int i=0; i<size; ++i) {
            sum += arr[i];
        }
        System.out.println("The sum of the numbers you entered is "+sum);
    }
}
