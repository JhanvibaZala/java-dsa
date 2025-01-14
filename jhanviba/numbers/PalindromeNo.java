//a palindrome is a sequence of characters that reads the same
//backward as forward.

package com.jhanviba.numbers;
import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        int rev = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int input = sc.nextInt();
        int originalInput = input;

        while(input>0) {
            rem = input % 10;
            input = input / 10;
            rev = rev * 10 +rem;
        }

        if (originalInput == rev) {
            System.out.println(originalInput + " is palindrome number.");
        }
        else {
            System.out.println(originalInput + " is not palindrome number.");
        }
    }
}
