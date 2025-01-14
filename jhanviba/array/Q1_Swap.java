package com.jhanviba.array;

import java.util.Scanner;
import java.util.Arrays;

public class Q1_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array of size 5 : ");
        int[] array = new int[5];

        // Will store the value that user enters
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        // Takes index 1
        System.out.print("Enter the index 1 : ");
        int index1 = sc.nextInt();


        // Takes index 2
        System.out.print("Enter the index 2 : ");
        int index2 = sc.nextInt();

        swap(array, index1, index2);

        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
