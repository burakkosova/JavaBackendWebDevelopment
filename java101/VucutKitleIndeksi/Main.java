package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, bmi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Vücut kitle indeksiniz : " + bmi);
    }
}
