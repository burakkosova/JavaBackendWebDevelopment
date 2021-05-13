package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;

        System.out.print("Matematik notunuzu giriniz: ");
        math = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        physics = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        chemistry = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        history = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        music = input.nextInt();

        int total = math + physics + chemistry + turkish + history + music;
        double avg = total / 6.0;
        System.out.println("Ortalamanız: " + avg);

        String message = avg < 60 ? "Sınıfta kaldı" : "Sınıfı geçti";
        System.out.println(message);
    }
}
