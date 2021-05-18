package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Fibonacci serisinin kaç elemanını görmek istiyorsunuz: ");
            int n = input.nextInt();

            int first=0,second=1,temp;

            for(int i=0; i<n; i++) {
                temp = second;
                second = first + second;
                first = temp;
                System.out.print(first + " ");
            }
        }catch (Exception e) {
            System.err.println("Hatali deger girdiniz");
        }finally {
            input.close();
        }
    }
}
