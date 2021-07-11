package dev.patika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        AccountManager accountManager = new AccountManager();
        Scanner scanner = new Scanner(System.in);
        System.out.print("E-posta adresini giriniz: ");
        String email = scanner.nextLine();
        System.out.print("Şifre giriniz: ");
        String password = scanner.nextLine();
        Account account = accountManager.login(email,password);
        System.out.println("Hoşgeldin "+account.getUser().getFirstName()+" "+account.getUser().getLastName());
        account.addAddress("Inegöl/BURSA");
        account.addAddress("Beşiktaş/İSTANBUL");
        account.addAddress("Tepebaşı/ESKİŞEHİR");
        account.addInsurance(new CarInsurance());
        account.showUserInfo();
    }
}
