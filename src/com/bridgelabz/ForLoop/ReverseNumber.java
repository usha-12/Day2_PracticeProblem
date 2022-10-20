package com.bridgelabz.ForLoop;

public class ReverseNumber {
    public static void reverseNumber(int number){
        int revNumber = 0;
        for (;number != 0;){
            int remainder = number % 10;
            revNumber = revNumber *10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse Number is :" +revNumber);

    }
    public static void main(String[] args) {
        System.out.println("Welcome To Reverse Number Program..");
        reverseNumber(231);
    }
}
