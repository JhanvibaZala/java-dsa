package com.jhanviba.numbers;
import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        int rem, rev = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        int OriginalNum = num;

        while(num > 0) {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem    ;
        }
        System.out.println("The reverse number of " + OriginalNum + " is " + rev);
    }
}
