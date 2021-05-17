package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        double n = input.nextInt();
        double result = 0;
        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.printf(Locale.US,"%.2f",result);
    }
}
