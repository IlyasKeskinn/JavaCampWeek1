package com.company;

public class Main {

    public static void main(String[] args) {

        int number = -5;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Girilen sayı asaldır.");
        } else {
            System.out.println("Girilen sayı asal değildir.");
        }

    }
}
