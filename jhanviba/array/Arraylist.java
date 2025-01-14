package com.jhanviba.array;

import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        // ArrayList dynamically increased the capacity of the list to 15.
        // We still add more numbers as it adjusts itself.

        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        System.out.println(list.contains(99));

        System.out.println(list.size());

        list.clear();
        System.out.println(list);
    }
}
