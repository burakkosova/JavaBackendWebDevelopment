package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n1, n2, operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n5-Bölme");
        System.out.print("Seçiminiz: ");
        operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme: " + ( n1 / n2));
                break;
            default:
                System.err.println("Yanlış seçim yaptınız!");
        }
    }
}
