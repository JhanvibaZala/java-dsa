package com.jhanviba.numbers;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int flag = 0, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        }
        else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.print(num + "is not Prime");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.println(num + " is Prime");
        }
    }
}


        // NOT WORKING //
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//        int c = 2;
//
//        if (c <= 1) {
//            System.out.println("Not a Prime number");
//        }
//
//        while (c*c <= n) {
//            if (n % c == 0) {
//                System.out.print("Not a Prime number");
//            }
//            else {
//                System.out.println("Prime");
//            }
//            c++;
//        }

