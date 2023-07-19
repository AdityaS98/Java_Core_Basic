package com.examples;

import java.util.*;

public class CoinStimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, headcount = 0, tailcount = 0;
        double heads, tails;
        System.out.print("Enter how many times you want to flip the coin: ");
        n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            double random = Math.random();
            if (random < 0.5)
                tailcount++;
            else headcount++;
        }

        heads = headcount / (double) n * 100;
        tails = tailcount / (double) n * 100;

        System.out.println("Percentage of heads: " + heads);
        System.out.println("Percentage of tails: " + tails);
    }

}


