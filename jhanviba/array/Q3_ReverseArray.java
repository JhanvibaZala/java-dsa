package com.jhanviba.array;

import java.util.Scanner;
import java.util.Arrays;

public class Q3_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        getReverse(array);
        System.out.println(Arrays.toString(array));
    }

    static void getReverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while(start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
