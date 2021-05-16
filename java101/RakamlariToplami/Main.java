package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        try {
            int n = input.nextInt();
            System.out.println("Girdiğiniz sayının rakamları toplamı: " + sumDigits(n));
        }catch (Exception e) {
            System.err.println("Hatalı değer girdiniz!");
        }finally {
            input.close();
        }
    }

    public static int sumDigits(int n) {
        int total = 0;

        while(n != 0) {
            total += n % 10;
            n /= 10;
        }

        return total;
    }

}
