package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Bir sayı giriniz: ");
            int n = input.nextInt();

            for(int i=0; i<n; i++) {
                for(int j=0; j<i; j++)
                    System.out.print(" ");

                for(int j=1; j<=(2*(n-i)-1); j++)
                    System.out.print("*");

                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Hatali deger girdiniz");
        } finally {
            input.close();
        }
    }
}
