package com.jhanviba.numbers;
import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        int rem , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int originalNum = num;

        while(num>0) {
                rem = num % 10;
                sum = sum + rem * rem * rem;
                num = num / 10;
        }
        if (originalNum == sum) {
            System.out.println(originalNum + " is Armstrong number.");
        }
        else {
            System.out.println(originalNum + " is not Armstrong number.");
        }

    }
}
