package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        for (int i = 0; Math.pow(4, i) <= number; i++) {
            if (i == 0) {
                System.out.print(1 + ", ");
                continue;
            }

            System.out.print((int) Math.pow(4, i) + ", ");

            if(Math.pow(5, i) <= number)
                System.out.print((int) Math.pow(5, i) + ", ");
        }

        input.close();
    }
}
