package com.company;

public class Main {

    public static void main(String args[]) {
        for(int i=1; i<=20; i++)
            System.out.print(fibonacci(i) + " ");
    }

    static int fibonacci(int n)
    {
        if(n <= 0)
            return -1;

        if(n == 1 || n == 2)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2); // 1 1 2 3 5 8 13 21 34 55 89 144
    }
}