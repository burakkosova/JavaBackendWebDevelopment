package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Kaç tane sayı gireceksiniz: ");
            int n = input.nextInt();

            System.out.print("1. Sayıyı giriniz: ");
            int max = input.nextInt();
            int min = max;

            int number;
            for (int i = 2; i <= n; i++) {
                System.out.print(i + ". Sayıyı giriniz: ");
                number = input.nextInt();

                if (number < min)
                    min = number;

                if (number > max)
                    max = number;
            }

            System.out.println("En büyük sayı: " + max);
            System.out.println("En küçük sayı: " + min);
        } catch (Exception e) {
            System.out.println("Hatali deger girdiniz");
        } finally {
            input.close();
        }
    }
}
