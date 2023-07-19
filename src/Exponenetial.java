package com.examples;

import java.util.Scanner;

public class Exponenetial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for table");

        int number = sc.nextInt();


        if (number < 31) {


            for (int i = 1; i <= number; i++)
                System.out.println("2 power " + i + " = " + (int) Math.pow(2, i));
        } else {
            System.out.println("Out of integer range");
        }
    }
}

