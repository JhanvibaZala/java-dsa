package com.jhanviba.ifelse;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid operator : ");
        while (true) {
            int op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter num1 : ");
                int num1 = sc.nextInt();
                System.out.print("Enter num2 : ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                else {
                    System.out.println("Enter the valid numbers!!");
                }
            }
            System.out.println("Answer is " + ans);
        }
    }
}
