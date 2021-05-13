package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvOrani, kdvsizFiyat, kdvliFiyat, kdvTutari;
        System.out.print("Ücreti giriniz: ");
        kdvsizFiyat = input.nextDouble();
        kdvOrani = (kdvsizFiyat < 1000 && kdvsizFiyat > 0) ? 0.18 : 0.08;
        kdvTutari = kdvsizFiyat * kdvOrani;
        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat = " + kdvsizFiyat + "\nKDV'li Fiyat = " + kdvliFiyat
        + "\nKDV tutarı = " + String.format("%.2f",kdvTutari));

    }
}
