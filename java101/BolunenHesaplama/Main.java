package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        int total = 0, count = 0;
         for (int i=1; i<=number; i++) {
             if(i % 12 == 0){
                 total += i;
                 count++;
             }
         }

         if(count == 0)
             count = 1;

        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + (double) total/count);
    }
}
