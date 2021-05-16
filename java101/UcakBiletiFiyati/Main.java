package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int distance, age, type;
        double pricePerKm = 0.1, ticketPrice;
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Mesafeyi km türünden giriniz : ");
            distance = input.nextInt();

            System.out.print("Yaşınızı giriniz : ");
            age = input.nextInt();

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
            type = input.nextInt();

            if(distance <= 0 || type < 1 || type > 2 || age < 0)
                throw new Exception();

            ticketPrice = distance * pricePerKm;

            if(age < 12)
                ticketPrice /= 2;
            else if(age >= 12 && age <= 24)
                ticketPrice -= (ticketPrice * 0.1);
            else if(age > 65)
                ticketPrice -= (ticketPrice * 0.3);

            if(type == 2) {
                ticketPrice -= (ticketPrice * 0.2);
                ticketPrice *= 2;
            }

            System.out.println();
            System.out.println("Toplam Tutar = " + format(ticketPrice) + " TL");


        } catch (Exception e) {
            System.out.println();
            System.err.println("Hatalı veri girdiniz!");
        } finally {
            input.close();
        }

    }

    public static String format(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
}
