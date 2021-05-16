package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Üssü alınacak sayıyı giriniz: ");
            int n = input.nextInt();

            System.out.print("Üs değerini giriniz: ");
            int r = input.nextInt();

            System.out.println("Cevap: " + pow(n,r));

        }catch (Exception e) {
            System.err.println("Yanlış değer girdiniz!");
        }finally {
            input.close();
        }
    }

    public static int pow(int a, int b) {
        int result = 1;
        for(int i=1; i<=b; i++) {
            result *= a;
        }

        return result;
    }

}
