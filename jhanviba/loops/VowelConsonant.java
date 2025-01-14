package com.jhanviba.loops;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter : ");
        String ch = sc.nextLine();
        ch = ch.toLowerCase();

        for(int i=0;i<ch.length();i++) {
            char vc = ch.charAt(i);
            if(vc == 'a' || vc == 'e' || vc == 'i' || vc =='o' || vc == 'u') {
                System.out.println(vc + " is vowel");
            }
            else if (vc >= 'a' && vc <= 'z') {
                System.out.println(vc + " is consonant");
            }
            else {
                System.out.println(vc + " is not a letter");
            }
        }
    }
}