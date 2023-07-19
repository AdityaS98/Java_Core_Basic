package com.examples;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, i = 2;
        System.out.println("Enter the Number");
        num = sc.nextInt();
        temp = num;
        System.out.print("Prime factor of number is : ");
        while (temp > 1) {
            if (temp % i == 0) {
                System.out.print(i + ",");
                temp = temp / i;
            } else {
                i++;
            }
        }

    }
}
