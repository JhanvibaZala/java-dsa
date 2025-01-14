package com.jhanviba.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_MaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        System.out.print("Enter array of size 5 : ");
        int[] array = new int[n];

        // Will store the value that user enters
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        checkMaximum(array);

//        int ans = checkMaximum(array);
//        System.out.println(ans);
    }

    static int checkMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The maximum is " + max);
        return max ;
//        return max;


    }
}
