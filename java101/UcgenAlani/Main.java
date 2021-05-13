package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1, kenar2, kenar3;

        System.out.print("Üçgenin 1. kenarını giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("Üçgenin 2. kenarını giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("Üçgenin 3. kenarını giriniz: ");
        kenar3 = input.nextInt();

        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
