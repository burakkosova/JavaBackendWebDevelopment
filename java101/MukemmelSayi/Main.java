package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Bir sayı giriniz: ");
            int number = input.nextInt();
            if(isPerfect(number))
                System.out.println(number + " mükemmel sayıdır.");
            else
                System.out.println(number + " mükemmel sayı değildir.");
        } catch (Exception e) {
            System.out.println("Hatali deger girdiniz");
        } finally {
            input.close();
        }
    }

    public static boolean isPerfect(int n) {
        int total = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0)
                total += i;
        }

        if(total == n)
            return true;

        return false;
    }
}
