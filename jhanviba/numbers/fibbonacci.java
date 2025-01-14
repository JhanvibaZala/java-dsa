package com.jhanviba.numbers;
import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        int f1 = 1, f2 = 1, f3, i;
        System.out.print(f1 + "\t" + f2 + "\t");
        for(i=0;i<n;i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + "\t");
        }
    }
}
