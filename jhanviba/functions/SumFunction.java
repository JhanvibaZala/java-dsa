package com.jhanviba.functions;
import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        int ans = sum(10,20);
        System.out.println(ans);
    }
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
