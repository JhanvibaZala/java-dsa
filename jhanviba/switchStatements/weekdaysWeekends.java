package com.jhanviba.switchStatements;
import java.util.Scanner;

public class weekdaysWeekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        int day = sc.nextInt();

        switch(day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter valid number in between 1 to 7!!");
        }
    }
}
