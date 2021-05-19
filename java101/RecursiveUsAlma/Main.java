package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int power = input.nextInt();
        System.out.println("Sonuç: " + pow(base,power));
    }

    static double pow(int base, int power) {
        if(power<0)
            return 1/pow(base,-power);

        if(power==0)
            return 1;

        return base * pow(base,--power);
    }
}