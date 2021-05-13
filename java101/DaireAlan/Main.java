package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        double radius,area,angle;

        System.out.print("Dairenin yarıçapını giriniz: ");
        radius = input.nextInt();
        System.out.print("Daire diliminin açı ölçüsünü giriniz: ");
        angle = input.nextInt();

        area = (PI * radius * radius * angle) / 360;

        System.out.println("Daire diliminin alanı: " + area);
    }
}
