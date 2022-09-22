package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        int divisorTotal = 0;

        for (int i = 1 ; i < number; i++){
            if (number % i == 0) {
                divisorTotal += i;
            }
        }

        if (number==divisorTotal){
            System.out.println("Sayı mükemmeldir.");
        }
        else {
            System.out.println("Mükemmel sayı değildir.");
        }


    }
}
