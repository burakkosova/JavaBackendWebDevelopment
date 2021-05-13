package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKg, armutFiyat = 2.14,
                elmaKg, elmaFiyat = 3.67,
                domatesKg, domatesFiyat = 1.11,
                muzKg, muzFiyat = 0.95,
                patlıcanKg, patlıcanFiyat = 5.00;

        System.out.print("Armut kaç kilo ? :");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilo ? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilo ? :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        patlıcanKg = input.nextDouble();

        double toplamTutar = (armutFiyat * armutKg)
                + (elmaFiyat * elmaKg)
                + (domatesFiyat * domatesKg)
                + (muzFiyat * muzKg)
                + (patlıcanFiyat * patlıcanKg);
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
