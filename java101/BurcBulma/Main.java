package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int month, day;
        String wrongDay = "Gün değerini hatalı girdiniz!", wrongMonth = "Ay değerini hatalı girdiniz!";
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Doğduğunuz ay: ");
            month = input.nextInt();

            System.out.print("Doğduğunuz gün: ");
            day = input.nextInt();

            if (month == 1) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz oğlak!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz kova!");
                else
                    System.err.println(wrongDay);
            } else if (month == 2) {
                if (day > 0 && day < 20)
                    System.out.println("Burcunuz kova!");
                else if (day >= 20 && day <= 29)
                    System.out.println("Burcunuz balık!");
                else
                    System.err.println(wrongDay);
            } else if (month == 3) {
                if (day > 0 && day < 21)
                    System.out.println("Burcunuz balık!");
                else if (day >= 21 && day <= 31)
                    System.out.println("Burcunuz koç!");
                else
                    System.err.println(wrongDay);
            } else if (month == 4) {
                if (day > 0 && day < 21)
                    System.out.println("Burcunuz koç!");
                else if (day >= 21 && day <= 30)
                    System.out.println("Burcunuz boğa!");
                else
                    System.err.println(wrongDay);
            } else if (month == 5) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz boğa!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz ikizler!");
                else
                    System.err.println(wrongDay);
            } else if (month == 6) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz ikizler!");
                else if (day >= 23 && day <= 30)
                    System.out.println("Burcunuz yengeç!");
                else
                    System.err.println(wrongDay);
            } else if (month == 7) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz yengeç!");
                else if (day >= 23 && day <= 31)
                    System.out.println("Burcunuz aslan!");
                else
                    System.err.println(wrongDay);
            } else if (month == 8) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz aslan!");
                else if (day >= 23 && day <= 31)
                    System.out.println("Burcunuz başak!");
                else
                    System.err.println(wrongDay);
            } else if (month == 9) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz başak!");
                else if (day >= 23 && day <= 30)
                    System.out.println("Burcunuz terazi!");
                else
                    System.err.println(wrongDay);
            } else if (month == 10) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz terazi!");
                else if (day >= 23 && day <= 31)
                    System.out.println("Burcunuz akrep!");
                else
                    System.err.println(wrongDay);
            } else if (month == 11) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz akrep!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz yay!");
                else
                    System.err.println(wrongDay);
            } else if (month == 12) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz yay!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz oğlak!");
                else
                    System.err.println(wrongDay);
            } else
                System.err.println(wrongMonth);

        } catch (InputMismatchException e) {
            System.out.println("Lütfen ay ve günü rakam olarak giriniz!");
        } finally {
            input.close();
        }

    }
}
