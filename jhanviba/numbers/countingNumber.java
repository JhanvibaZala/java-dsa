// counting the occurrence i.e, 564585 the total times num
// repeats of 5 is 3

package com.jhanviba.numbers;
import java.util.Scanner;

public class countingNumber {
    public static void main(String[] args) {
        int rem, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the digit : ");
        int digit = sc.nextInt();
        while(num > 0) {
            rem = num % 10;
            if(rem == digit) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("The total "+digit+" in the number is "+count);
    }
}
