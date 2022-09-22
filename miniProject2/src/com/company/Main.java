package com.company;

public class Main {

    public static void main(String[] args) {

        char character = 'C';

        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Harf kalın seslidir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Harf İnce seslidir.");
                break;
            default:
                System.out.println("Sessiz harf.");
        }

    }
}
