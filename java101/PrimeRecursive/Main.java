package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = input.nextInt();
        if(isPrime(n))
            System.out.println(n + " sayısı ASALDIR !");
        else
            System.out.println(n + " sayısı ASAL değildir !");
    }

    static boolean isPrime(int n) {
        return isPrime1(n,3);
    }

    static boolean isPrime1(int n, int i) {
        if (n < 2)
            return false;

        if (n % 2 == 0)
            return (n == 2);

        if(i * i > n)
            return true;

        if (n % i == 0)
            return false;

        return isPrime1(n,i+2);
    }
}