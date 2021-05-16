package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Doğum yılınızı giriniz: ");
            int birthYear = input.nextInt();

            if(birthYear < 0)
                throw new Exception();

            int mod = birthYear % 12;
            String chineseZodiac;

            switch (mod) {
                case 0:
                    chineseZodiac = "Maymun";
                    break;
                case 1:
                    chineseZodiac = "Horoz";
                    break;
                case 2:
                    chineseZodiac = "Köpek";
                    break;
                case 3:
                    chineseZodiac = "Domuz";
                    break;
                case 4:
                    chineseZodiac = "Fare";
                    break;
                case 5:
                    chineseZodiac = "Öküz";
                    break;
                case 6:
                    chineseZodiac = "Kaplan";
                    break;
                case 7:
                    chineseZodiac = "Tavşan";
                    break;
                case 8:
                    chineseZodiac = "Ejderha";
                    break;
                case 9:
                    chineseZodiac = "Yılan";
                    break;
                case 10:
                    chineseZodiac = "At";
                    break;
                case 11:
                    chineseZodiac = "Koyun";
                    break;
                default:
                    System.out.println(chineseZodiac = "none");

            }

            System.out.println("Çin Zodyağı Burcunuz : " + chineseZodiac);
        }catch (Exception e) {
            System.err.println("Hatalı değer girdiniz!");
        }finally {
            input.close();
        }
    }
}
