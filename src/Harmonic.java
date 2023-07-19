package com.examples;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0, num = 0, j;
        int n;

        System.out.print("enter the harmonic you want to find: ");
        n = sc.nextInt();

        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("The value of harmonic no. is: " + result);

    }
}
