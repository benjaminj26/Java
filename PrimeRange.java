package Java;

import java.util.Scanner;
import java.lang.Math;

public class PrimeRange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int low,upp;
        System.out.println("Input the lower limit: ");
        low = sc.nextInt();
        System.out.println("Input the upper limit: ");
        upp = sc.nextInt();
        for(int i = low; i < upp; ++i)
        {
            int flag=0;
            for(int j = 2; j <= Math.sqrt(i); ++j)
            {
                if(i%j == 0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
