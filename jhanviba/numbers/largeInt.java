package com.jhanviba.numbers;
import java.util.Scanner;

public class largeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        if(a > b){
            if(a > c){
                System.out.println(a+ " is the largest.");
            }
            else{
                System.out.println(c + " is the largest.");
            }
        }
        else if(b > c){
            System.out.println(b + " is the largest.");
        }
        else{
            System.out.println(c + " is the largest.");
        }

        // Short way to solve max problem
        System.out.println("\n\n----Using Math function----");
        int max = Math.max(c, Math.max(a,b));
        System.out.println("Maximum/Largest number : " + max);
    }
}
