package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt(), total=0;

        while(number % 2 == 0) {
            if(number % 4 == 0)
                total += number;

            System.out.println(number);

            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();
        }

        System.out.println("4 ün katı olanların toplamı: "+total);
        input.close();
    }
}
