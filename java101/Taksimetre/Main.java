package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe, acilisUcreti = 10, kmBasiTutar = 2.2, minTutar = 20,toplamTutar;
        System.out.print("Gidilen mesafeyi giriniz(km): ");
        mesafe = input.nextDouble();
        toplamTutar = (kmBasiTutar * mesafe + acilisUcreti) < minTutar ? 20 : kmBasiTutar * mesafe + acilisUcreti;

        System.out.println("Taksimetre tutarı: " + toplamTutar);
    }
}
