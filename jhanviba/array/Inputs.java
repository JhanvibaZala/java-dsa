package com.jhanviba.array;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Using normal for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Using for each loop
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        //Using toString() method
        System.out.println(Arrays.toString(arr));
    }
}
