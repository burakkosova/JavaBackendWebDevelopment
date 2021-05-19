package com.company;

public class Main {

    public static void main(String args[]) {
        int number = 1453;
        int temp = reverse(number,0);
        System.out.println(temp);
        if(temp == number)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }

    static int reverse(int number, int temp)
    {
        if(number == 0)
            return temp;

        temp = (temp * 10) + (number%10);
        return reverse(number/10,temp);
    }
}