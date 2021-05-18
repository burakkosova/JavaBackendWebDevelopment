package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("EBOB: " + EBOB(n1,n2));
        System.out.println("EKOK: " + EKOK(n1,n2));

        input.close();
    }

    public static int EBOB(int a, int b) {
        int result = 1;
        int min = a < b ? a : b;
        int counter = min;

        while(counter>=min) {
            if(a % counter == 0 && b % counter == 0) {
                result = counter;
                break;
            }
            counter--;
        }

        return result;
    }

    public static int EKOK(int a, int b) {
        return (a*b) / EBOB(a,b);
    }
}
