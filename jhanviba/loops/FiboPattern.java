package com.jhanviba.loops;
import java.util.Scanner;

public class FiboPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int f1 = 0, f2 = 1, f3;

        // Start by printing the Fibonacci pattern
        for (int i = 0; i < n; i++) {
            // Print Fibonacci numbers for the current row
            for (int j = 0; j <= i; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(f1 + "\t"); // First number in the first row
                } else if (i == 0 && j == 1) {
                    System.out.print(f2 + "\t"); // Second number in the first row
                } else {
                    f3 = f1 + f2; // Calculate the next Fibonacci number
                    System.out.print(f3 + "\t");
                    f1 = f2; // Update f1 and f2 for the next Fibonacci number
                    f2 = f3;
                }
            }
            System.out.println(); // New line after each row
        }
    }
}
