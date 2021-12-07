/*
    Author : Benjamin Joseph
    Date : 07-12-2021
*/

import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        int vowels=0,consonants=0;
        System.out.println("Input a string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        char ch;
        for(int i=0; i<str1.length(); ++i)
        {
            ch = str1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else if(ch >= 'a' && ch <= 'z')
            consonants++;
        }
        System.out.println("Number of vowels = "+vowels);
        System.out.println("Number of consonants = "+consonants);
    }
}
