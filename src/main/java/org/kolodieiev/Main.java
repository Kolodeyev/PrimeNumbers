package org.kolodieiev;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        findPrimes(1, 100);
        showPrimes(1, 1000);
//        showPrimes(1000, 1000000);

    }

    private static void showPrimes(int start, int end) {
        ArrayList<Integer> result = findPrimes(start, end);
        System.out.println("Show the prime numbers: " + result);
    }

    private static ArrayList<Integer> findPrimes(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                primes.add(i);
            }
        }
        return primes;
    }

}