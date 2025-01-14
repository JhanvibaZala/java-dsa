package com.jhanviba.functions;

import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {
//        int num;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        num = sc.nextInt();

        for (int i = 100; i < 1000; i++) {
            if (checkArmstrongNumber(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    static boolean checkArmstrongNumber(int num) {
        int rem, sum=0, original;
        original = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }

        if (sum == original)
            return true;
        else
            return false;

    }
}
