package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        int starCount=1;
        for (int i=0; i<n; i++) {
            for(int j=1; j<n-i; j++)
                System.out.print(" ");


            for(int j=0; j<starCount; j++)
                System.out.print("*");

            starCount+=2;
            System.out.println();
        }

        starCount-=2;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<=i; j++)
                System.out.print(" ");

            starCount-=2;
            for(int j=0; j<starCount; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
