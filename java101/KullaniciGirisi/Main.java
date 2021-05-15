package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password, answer, newPassword, trueUserName = "admin", truePassword = "admin123";
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.next();
        System.out.print("Şifreyi giriniz: ");
        password = input.next();

        if (userName.equals(trueUserName)) {
            if (password.equals(truePassword)) {
                System.out.println("Giriş başarılı!");
            } else {
                System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (e/h) ");
                answer = input.next();

                if (answer.equalsIgnoreCase("e")) {
                    while(true) {
                        System.out.print("Yeni şifreyi giriniz: ");
                        newPassword = input.next();
                        if (!newPassword.equals(truePassword) && !newPassword.equals(password)) {
                            truePassword = newPassword;
                            System.out.println("Şifre oluşturuldu");
                            break;
                        } else
                            System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                    }
                }
            }
        } else
            System.out.println("Böyle bir kullanıcı bulunamadı!");

        input.close();
    }
}
