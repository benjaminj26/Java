import java.util.Scanner;

public class StringComp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        System.out.println("Input the first string: ");
        str1 = sc.nextLine();
        System.out.println("Input the second string: ");
        str2 = sc.nextLine();
        if(str1.equals(str2))
        {
            System.out.println("The two strings are the same");
        }
        else
        {
            System.out.println("The two strings are not the same");
        }
    }
}
