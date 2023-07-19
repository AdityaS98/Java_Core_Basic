package com.examples;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first Number");
        a = sc.nextInt();
        System.out.println("Enter The second Number");
        b = sc.nextInt();
        System.out.println("Enter the third Number");
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is greatest ");
        } else if (b > a && b > c) {
            System.out.println("B is greatest ");

        } else {
            System.out.print("C is Greatest");
        }
    }
}
