package com.jhanviba.functions;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the naam : ");
        String naam = sc.nextLine();
        String personalized = greet(naam);
        System.out.println(personalized);
    }

    static String greet(String name) {
        String msg = "Hello " + name;
        return msg;
    }
}

//public class Greeting {
//    public static void main(String[] args) {
//        String msg = greeting();
//        System.out.println(msg);
//    }
//    static String greeting() {
//        String greet = "Namaste!\nAap kese ho?";
//        return greet;
//    }
//}
