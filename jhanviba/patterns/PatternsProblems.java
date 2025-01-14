package com.jhanviba.patterns;

public class PatternsProblems {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(5, 4);
        otherPattern5(5);
        pattern6(5);
        otherPattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        otherPattern12(5);
        pattern13(5);
        otherPattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        pattern20(5);
        pattern21(5);
        pattern22(5);
        pattern23(3);
        pattern24(5);       //REMAINING - ERROR
        pattern25(5);
        patternRhombus25(5);
        pattern26(5);
        pattern27(4);       //REMAINING - ERROR
        pattern28(5);
        pattern29(5);
        pattern30(5);
        pattern31(5);       //REMAINING - ERROR
        pattern32(5);       //REMAINING
        pattern33(5);       //REMAINING
        pattern34(5);       //REMAINING
        pattern35(5);       //REMAINING
    }

    static void pattern1(int n) {
        System.out.println("Pattern 1 :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern2(int n) {
        System.out.println("\nPattern 2 :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern3(int n) {
        System.out.println("\nPattern 3 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern4(int n) {
        System.out.println("\nPattern 4 :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    static void pattern5(int n, int m) {
        System.out.println("\nPattern 5 :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int k = m; k >= 1; k--) {
            for (int l = 1; l <= k; l++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void otherPattern5(int n) {
        System.out.println("\nOther way of  Pattern 5 :");
        for (int i = 0; i < n * 2; i++) {
            int totalRowsInCols = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalRowsInCols; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern6(int n) {
        System.out.println("\nPattern 6 :");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void otherPattern6(int n) {
        System.out.println("\nOther way of  Pattern 6 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void pattern7(int n) {
        System.out.println("\nPattern 7 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void pattern8(int n) {
        System.out.println("\nPattern 8 :");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void pattern9(int n) {
        System.out.println("\nPattern 9 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void pattern10(int n) {
        System.out.println("\nPattern 10 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern11(int n) {
        System.out.println("\nPattern 11 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern12(int n) {
        System.out.println("\nPattern 12 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void otherPattern12(int n) {
        System.out.println("\nOther way of  Pattern 12 :");

        //Upper Part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //Lower Part
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern13(int n) {
        System.out.println("\nPattern 13 :");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void otherPattern13(int n) {
        System.out.println("\nOther way of  Pattern 13 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i); k++) {
                if (k == 0 || k == 2 * i || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void pattern14(int n) {
        System.out.println("\nPattern 14 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * (n - i) - 2); k++) {
                if (k == 0 || k == (2 * (n - i) - 2) || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void pattern15(int n) {
        System.out.println("\nPattern 15 :");
        //upper
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        //lower
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * (n - i) - 2; k++) {
                if (k == 0 || k == 2 * (n - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void pattern16(int n) {
        System.out.println("\nPattern 16 :");
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        System.out.println("\nPattern 17 :");
        //Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //Printing decreasing number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //Printing increasing number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //Lower half
        for (int i = n-2; i >= 1; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //Printing decreasing number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //Printing increasing number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        System.out.println("\nPattern 18 :");
        //Upper half
        for (int i = 0; i < n; i++) {
            //Printing stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            //Printing spaces in between
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            //Printing stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i = n-1; i >= 0; i--) {
            //Printing stars
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            //Printing spaces in between
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            //Printing stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern19(int n) {
        System.out.println("\nPattern 19 :");
        //Upper half
        for (int i = 0; i <= n; i++) {
            //Printing stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            //Printing spaces
            for (int j = 2*(n-i); j > 0; j--) {
                System.out.print(" ");
            }
            //Printing stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i = n-1; i >= 0  ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern20(int n) {
        System.out.println("\nPattern 20 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void pattern21(int n) {
        System.out.println("\nPattern 21 :");
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        System.out.println("\nPattern 22 :");
        for (int i = 0; i < n; i++) {
            int start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern23(int n) {
        System.out.println("\nPattern 23 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    static void pattern24(int n) {
        System.out.println("\nCustom Diamond Shape Pattern:");

        // Upper part of the pattern
        for (int i = 0; i < n / 2; i++) {
            // Print first half of the row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in between
            for (int j = 0; j < n - 2 * (i + 1); j++) {
                System.out.print(" ");
            }
            // Print second half of the row
            for (int j = 0; j <= i; j++) {
                if (i == n / 2 - 1 && j == i) break; // To prevent duplicate star in the middle
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print first half of the row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in between
            for (int j = 0; j < n - 2 * (i + 1); j++) {
                System.out.print(" ");
            }
            // Print second half of the row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern25(int n) {
        System.out.println("\nPattern 25 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                if (i == 0 || i == n - 1 || k == 0 || k == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }

    static void patternRhombus25(int n) {
        System.out.println("\nPattern 25 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                if (i == 0 || i == n - 1 || k == 0 || k == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void pattern26(int n) {
        System.out.println("\nPattern 26 :");
        int number = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
            }
            number++;
            System.out.println();
        }
    }

    static void pattern27(int n) {
        System.out.println("\nPattern 27 :");
        int number = 1;
        int totalNumbers = n * (n + 1) / 2;
        int startRightHalf = totalNumbers - n + 1;

        for (int i = 0; i < n; i++) {
            //Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Left part of the pattern
            for (int j = 0; j < n - i; j++) {
                System.out.print(number + " ");
                number++;
            }

            // Right part of the pattern
            for (int j = 0; j < n - i; j++) {
                System.out.print(startRightHalf + " ");
                startRightHalf++;
            }

            // Adjust `startRightHalf` for the next row
            startRightHalf = startRightHalf - (n - i);
            System.out.println();
        }
    }


    static void pattern28(int n) {
        System.out.println("\nPattern 28 :");

    }

    static void pattern29(int n) {
        System.out.println("\nPattern 29 :");
        //Upper half
        for (int i = 0; i <= n; i++) {
            //Printing stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            //Printing spaces
            for (int j = 2*(n-i); j > 0; j--) {
                System.out.print(" ");
            }
            //Printing stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i = n-1; i >= 0  ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern30(int n) {
        System.out.println("\nPattern 30 :");
        //Upper
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //Lower
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void pattern31(int n) {
        System.out.println("\nPattern 31 :");
        int num = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = Math.min(Math.min(i, j), Math.min(num - 1 - i, num - 1 - j)) + 1;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        System.out.println("\nPattern 32 :");
        for (int i = 0; i < n; i++) {

        }
    }

    static void pattern33(int n) {
        System.out.println("\nPattern 33 :");
        for (int i = 0; i < n; i++) {

        }
    }

    static void pattern34(int n) {
        System.out.println("\nPattern 34 :");
        for (int i = 0; i < n; i++) {

        }
    }

    static void pattern35(int n) {
        System.out.println("\nPattern 35 :");
        for (int i = 1; i <= n; i++) {
            //left-side
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            //Spaces
            for (int j = 1; j < 2*(n-i); j++) {
                System.out.print(" ");
            }
            //right-side
            for (int j = n; j >=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
