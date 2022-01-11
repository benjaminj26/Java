/*
*   Java program to convert an infix expression to a postfix expression
*   Author : Benjamin Joseph
*   Date : 08-01-2022
*/

package Java;

import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Infix expression: ");
        String expression = sc.nextLine();
        int size = expression.length();
        char[] stack = new char[size/2+1];
        int top = -1;
        System.out.println("The expression you entered is "+expression);
        for(int i=0; i<size; ++i) {
            char ch = expression.charAt(i);
            if(priority(ch) == -1) {
                System.out.print(ch);
            }
            else if(ch == ')') {
                while(stack[top] != '(') {
                    System.out.print(stack[top]);
                    top = pop(stack, top);
                }
                top = pop(stack,top);
            }
            else if(top == -1 || priority(ch) > priority(stack[top])) {
                top = push(ch,stack,top);
            }
            else if(priority(ch) <= priority(stack[top])) {
               while(priority(ch) <= priority(stack[top])) {
                   System.out.print(stack[top]);
                   top = pop(stack,top);
                   if(top == -1) {
                        break;
                   }
               }
               top = push(ch,stack,top);
            }
            if(i == size-1) {
                while(top >= 0) {
                    System.out.print(stack[top]);
                    top = pop(stack,top);
                }
            }
        }
    }
    static int push(char ch, char[] stack, int top) {
        top++;
        stack[top] = ch;
        return top;
    }

    static int pop(char[] stack, int top) {
        top--;
        return top;
    }

    static int priority(char ch) {
        if(ch == '(' || ch == ')'){
            return 0;
        }
        else if(ch == '+' || ch =='-') {
            return 1;
        }
        else if(ch == '*' || ch =='/') {
            return 2;
        }
        else if(ch == '^') {
            return 3;
        }
        else {
            return -1;
        }
    }
}
