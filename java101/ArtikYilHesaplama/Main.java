package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Yıl Giriniz : ");
            int year = input.nextInt();

            if(year < 0)
                throw new Exception();

            if(isLeapYear(year))
                System.out.println(year + " bir artık yıldır !");
            else
                System.out.println(year + " bir artık yıl değildir !");

        }catch (Exception e) {
            System.err.println("Hatalı değer girdiniz!");
        }finally {
            input.close();
        }
    }

    public static boolean isLeapYear(int year) {
        if(year % 4 != 0)
            return false;

        if(year % 100 == 0 && year % 400 != 0)
            return false;

        return true;
    }
}
