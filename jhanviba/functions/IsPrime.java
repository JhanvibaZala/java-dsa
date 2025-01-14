package com.jhanviba.functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean ans = checkPrime(n);
        System.out.println(ans);
    }
    static boolean checkPrime(int n) {
        if (n<=1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        }
        return false;
    }
}
