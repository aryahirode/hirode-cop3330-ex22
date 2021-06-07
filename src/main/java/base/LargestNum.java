/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class LargestNum {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        LargestNum myApp = new LargestNum();
        myApp.output();
    }

    private int num1Prompt() {
        System.out.print("Enter the first number: ");
        return Integer.parseInt(in.nextLine());
    }

    private int num2Prompt() {
        System.out.print("Enter the second number: ");
        return Integer.parseInt(in.nextLine());
    }

    private int num3Prompt() {
        System.out.print("Enter the third number: ");
        return Integer.parseInt(in.nextLine());
    }

    private int largeNum(int num1, int num2, int num3) {
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            return -1;
        }
        if (num1 > num2 && num1 > num3) {
            return num1;
        }
        else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        else {
            return num3;
        }
    }

    private void output() {
        int largeNum = largeNum(num1Prompt(), num2Prompt(), num3Prompt());
        if (largeNum == -1) {
            System.out.println("At least two of those numbers are equal.");
            System.exit(0);
        }
        System.out.printf("The largest number is %d.\n", largeNum);
    }
}
