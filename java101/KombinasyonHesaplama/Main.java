package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("n değerini giriniz: ");
            int n = input.nextInt();

            System.out.print("r değerini giriniz: ");
            int r = input.nextInt();

            System.out.println(combination(n,r));
            System.out.println(combination2(n,r));
        }catch (Exception e) {
            System.err.println("Yanlış değer girdiniz!");
        }finally {
            input.close();
        }
    }

    public static int factorial(int n) {
        if(n < 0)
            return -1;

        if(n == 0)
            return 1;

        return n * factorial(n-1);
    }

    public static int combination(int n, int r) {
        if(n < 0 || r < 0 || n < r)
            return -1;

        if(n == r)
            return 1;

        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public static int combination2(int n, int r) {
        if(n < 0 || r < 0 || n < r)
            return -1;

        if(n == r)
            return 1;

        int x=n;
        for(int i=1; i<r; i++){
            x *= n-i;
        }
        return x / factorial(r);
    }
}
