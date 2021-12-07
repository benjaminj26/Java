/*
    Author : Benjamin Joseph
    Date : 07-12-2021
*/

public class Calculator
{
    public static void main(String[] args)
    {
        String symbol = args[0];
        float n1 = Float.parseFloat(args[1]);
        float n2 = Float.parseFloat(args[2]);
        switch(symbol)
        {
            case "add": System.out.println("Sum = "+(n1+n2));
            break;
            case "sub": System.out.println("Difference = "+(n1-n2));
            break;
            case "mul": System.out.println("Product = "+(n1*n2));
            break;
            case "div": System.out.println("Quotient = "+(n1/n2));
            break;
            default: System.out.println("Invalid Input");
        }
    }
}
