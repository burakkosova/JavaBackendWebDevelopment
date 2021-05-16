package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math, physics, chemistry, turkish, music,count=0, total=0.0, average;
         

        System.out.print("Matematik notunuzu giriniz: ");
        math = input.nextDouble();
        if(math <= 100 && math >= 0){
            total += math;
            count++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        physics = input.nextDouble();
        if(physics <= 100 && physics >= 0){
            total += physics;
            count++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        chemistry = input.nextDouble();
        if(chemistry <= 100 && chemistry >= 0) {
            total += chemistry;
            count++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = input.nextDouble();
        if(turkish <= 100 && turkish >= 0){
            total += turkish;
            count++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        music = input.nextDouble();
        if(music <= 100 && music >= 0){
            total += music;
            count++;
        }

        average = total / count;
        System.out.println("Ortalamanız: " + average);

        String message = average <= 55 ? "Sınıfta kaldınız!" : "Tebrikler sınıfı geçtiniz";
        System.out.println(message);

        input.close();
    }
}
