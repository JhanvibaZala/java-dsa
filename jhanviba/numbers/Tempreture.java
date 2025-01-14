package com.jhanviba.numbers;
import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the celsius temp : ");
        float cel = sc.nextFloat();
        float fah = ((1.8F) * cel + 32);
        System.out.println("The temperature in fahrenhit is "+fah);
    }
}
