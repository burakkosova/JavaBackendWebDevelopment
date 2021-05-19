package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = input.nextInt();
        goDeepBy5(n);
    }

    static void goDeepBy5(int n) {
        goDeepBy5(n,0);
    }

    static int goDeepBy5(int n, int count) {
        if(n <= 0)
            return goUpBy5(n,count);

        System.out.print(n + " ");
        return goDeepBy5(n-5,++count);
    }

    static int goUpBy5(int n, int count) {
        System.out.print(n + " ");

        if(count == 0)
            System.exit(0);

        return goUpBy5(n+5, --count);
    }
}