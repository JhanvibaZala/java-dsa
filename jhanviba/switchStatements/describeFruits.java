package com.jhanviba.switchStatements;
import java.util.Scanner;

public class describeFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit : ");
        String fruit = sc.next();

//        switch(fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Grapes":
//                System.out.println("A sweet fruit");
//                break;
//            case "Orange":
//                System.out.println("Eaten in winter and used for juice");
//                break;
//            case "Apple":
//                System.out.println("An ___ a day keeps the doc away");
//                break;
//            default:
//                System.out.println("Enter a valid fruit name!!");
//
//        }
        //Enhanced switch statements
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Grapes" -> System.out.println("A sweet fruit");
            case "Orange" -> System.out.println("Eaten in winter and used for juice");
            case "Apple" -> System.out.println("An ___ a day keeps the doc away");
            default -> System.out.println("Enter a valid fruit name!!");
        }
    }
}
